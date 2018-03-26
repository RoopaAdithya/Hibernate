package foo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOnetoOneRelationEx {

	public static void main(String[] args) {


		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		
		Laptop l=new Laptop();
		l.setLid(101);
		l.setLname("DELL");
		
		Student s=new Student();
		s.setStudentId(2);
		s.setStudnetName("Siri");
		s.setLaptop(l);
		
		session.save(l);
		session.save(s);
		
		t.commit();
		
	}

}
