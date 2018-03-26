package com.roopa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="javabook")
public class JavaBook implements Book {

	public void getBookInfo() {
		System.out.println("Java Book");
	}

}
