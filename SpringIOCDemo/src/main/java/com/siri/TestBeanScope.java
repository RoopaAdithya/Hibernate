package com.siri;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanScope {

	public static void main(String[] args) {

		// BeanFactory context1=new ClassPathXmlApplicationContext("bean.xml");

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"bean.xml");
		context.registerShutdownHook();
		BookImpl b = (BookImpl) context.getBean("book");
		b.setBname("Java Book");
		b.getBookIngo();

		BookImpl b1 = (BookImpl) context.getBean("book");

		b1.getBookIngo();

	}

}
