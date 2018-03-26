package com.roopa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="cbook")
public class CBook implements Book {

	public void getBookInfo() {


		System.out.println("C book");
	}

}
