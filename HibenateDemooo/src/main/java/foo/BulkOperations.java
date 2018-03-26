package foo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BulkOperations {

	public static void main(String[] args) {


		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		
		int size=5;
		for(int i=2;i<=50;i++)
		{
		Book b=new Book();
		
		b.setBid(i);
		b.setBname("book "+i);
		
		
		if(i%size==0)
		{
			session.flush();
			session.clear();
		}
		
		session.save(b);

		}
		
		t.commit();
	}

}
