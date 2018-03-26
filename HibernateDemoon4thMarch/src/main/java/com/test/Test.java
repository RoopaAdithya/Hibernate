package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();

		Session session = sf.openSession();

		Transaction t = session.beginTransaction();

		Student s = new Student();
		s.setSid(1);
		s.setSname("Ram");
		s.setMarks(24);
		
		session.save(s);
		
		t.commit();

	}

}
