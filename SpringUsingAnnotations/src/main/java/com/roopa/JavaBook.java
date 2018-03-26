package com.roopa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("javabook")

public class JavaBook implements Book {

	public void getBookIngo() {
		System.out.println("Java Book");
	}

}
