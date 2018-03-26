package foo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOnetoManyExistingEx {

	public static void main(String[] args) {



		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Student1 s1=(Student1) session.get(Student1.class, 101);
		
		
		Course c1=(Course) session.load(Course.class, 10);
		
		
		System.out.println(c1.getCnmae()+" "+c1.getDuration());
		System.out.println(s1.getStudentId()+" "+s1.getStudentName());
		
		Student1 s2=new Student1();
		
		s2.setStudentId(s1.getStudentId());

		s2.getCourses().add(c1);
		
		
		
		
		
		t.commit();
		
		
		

	}

}
