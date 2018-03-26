package foo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		Course3 c = (Course3) session.load(Course3.class, 10);

		System.out.println(c.getCid() + " " + c.getCname());

		Course3 c1 = (Course3) session.load(Course3.class, 10);
		System.out.println(c1.getCid() + " " + c1.getCname());

		
		System.out.println("*****************************************************");
		Session session1 = sf.openSession();

		Course3 c2 = (Course3) session1.load(Course3.class, 10);

		System.out.println(c2.getCid() + " " + c2.getCname());
		
		
		Session session2 = sf.openSession();

		Course3 c3 = (Course3) session2.load(Course3.class, 10);

		System.out.println(c3.getCid() + " " + c3.getCname());
		
	}

}
