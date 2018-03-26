package foo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLEx {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		String hql = "from Course3";
		Query q = session.createQuery(hql);

		List<Course3> l = q.list();

		for (Course3 c3 : l) {
			System.out.println(c3.getCid() + " " + c3.getCname());
		}

		System.out.println("***************From 0 to 3********");
		String hql1 = "from Course3";
		Query q1 = session.createQuery(hql1);
		q1.setFirstResult(1);
		q1.setMaxResults(3);

		List<Course3> l1 = q1.list();

		for (Course3 c3 : l1) {
			System.out.println(c3.getCid() + " " + c3.getCname());
		}
		System.out
				.println("**********Named Parameters Using where Clause ***********");

		Query q2 = session.createQuery("from Course3 c where c.cid=:cid"); // Name
																			// Parameters
		q2.setParameter("cid", 10);

		List<Course3> l3 = q2.list();

		for (Course3 c3 : l3) {
			System.out.println(c3.getCid() + " " + c3.getCname());
		}

		System.out
				.println("**********Named Parameters Using where Clause two conditionsss ***********");

		Query q3 = session
				.createQuery("from Course3 c where c.cid=:cid and c.cname=:cname"); // Name
																					// Parameters
		q3.setParameter("cid", 20);
		q3.setParameter("cname", "C");

		List<Course3> l4 = q3.list();

		for (Course3 c3 : l4) {
			System.out.println(c3.getCid() + " " + c3.getCname());
		}

		System.out.println("********Parameters ***********");

		Query q4 = session
				.createQuery("from Course3 c where c.cid=? and c.cname=?");

		q4.setInteger(0, 10);
		q4.setString(1, "Java");
		List<Course3> l5 = q4.list();

		for (Course3 c3 : l5) {
			System.out.println(c3.getCid() + " " + c3.getCname());
		}

		System.out.println("********Update Data ***********");

		Query q5 = session
				.createQuery("update Course3 set cname=? where cid=?");

		/*
		 * q5.setParameter("cname","JAVA"); q5.setParameter("cid",10);
		 */
		q5.setString(0, "JAVA");
		q5.setInteger(1, 20);

		int i = q5.executeUpdate();
		if (i == 1) {
			System.out.println("Success");
		}

		System.out.println("************Delete**********");

		Query q6 = session.createQuery("delete from Course3 where cid=:cid");

		q6.setParameter("cid", 50);
		int i1 = q6.executeUpdate();
		if (i1 == 1) {
			System.out.println("Success");
		}

	}

}
