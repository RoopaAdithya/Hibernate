package com.roopa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {


ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService1 e=(EmployeeService1) context.getBean("e1");
		
		e.print();

	}

}
