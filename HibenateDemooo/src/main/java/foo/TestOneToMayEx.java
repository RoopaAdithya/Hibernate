package foo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToMayEx {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		Course c1 = new Course();
		c1.setCid(20);
		c1.setCnmae("C");
		c1.setDuration(30);

		session.save(c1);
		
		
		/*Course c2 = new Course();
		c1.setCid(30);
		c1.setCnmae("Oracle");
		c1.setDuration(45);
*/
		session.save(c1);

/*		session.save(c2);
*/		
		Student1 s1 = new Student1();
		s1.setStudentId(101);
		s1.setStudentName("Siri");
		s1.getCourses().add(c1); // 3rd table create
		
		session.save(s1);

		t.commit();

	}

}
