package com.roopa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {


		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		
		
		BookService b=context.getBean(BookService.class);
		
		b.print();
		
		
	}

}
