package com.roopa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {


		Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		College c=new College();
		c.setCollegeId(1);
		c.setCollegeName("Womens College");
		c.setAddrss("Hyderabad");
		s.save(c);
		t.commit();
		
	}

}
