package foo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManytomanyEx {

	public static void main(String[] args) {


		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		
		Course3 c3=new Course3();
		c3.setCid(10);
		c3.setCname("Java");
		
		Student3 s3=new Student3();
		s3.setSid(100);
		s3.setSname("Raju");
		s3.getCourses().add(c3);
		c3.getStudents().add(s3);
		
		
		session.save(s3);
		session.save(c3);
		
		t.commit();
		
		
		

	}

}
