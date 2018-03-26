package foo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class CriteriaEx {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		Criteria c = session.createCriteria(Course3.class);

		c.add(Restrictions.eq("cid", 10));

		List<Course3> l = c.list();

		for (Course3 ss : l) {
			System.out.println(ss.getCid() + " " + ss.getCname());
		}

		System.out.println(" Using IN Operator");
		Object o[] = { 10, 20, 30 };

		Criteria c1 = session.createCriteria(Course3.class);

		c1.add(Restrictions.in("cid", o));

		List<Course3> l1 = c1.list();

		for (Course3 ss : l1) {
			System.out.println(ss.getCid() + " " + ss.getCname());
		}
		
		
		System.out.println("Using between");
		Criteria c2 = session.createCriteria(Course3.class);

		c2.add(Restrictions.between("cid", 10,30));
		
		List<Course3> l2 = c2.list();

		for (Course3 ss : l2) {
			System.out.println(ss.getCid() + " " + ss.getCname());
		}
		System.out.println("Using Like Operator");
		
		Object oo="J%";
		Criteria c3 = session.createCriteria(Course3.class);

		c3.add(Restrictions.like("cname",oo));
		
		List<Course3> l3 = c3.list();

		for (Course3 ss : l3) {
			System.out.println(ss.getCid() + " " + ss.getCname());
		}
		

		

	}

}
