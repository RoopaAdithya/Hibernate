package com.roopa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class BookService {

	
	Book b;
	
	@Autowired
	@Qualifier("javabook")
	public void setB(Book b) {
		this.b = b;
	}


	public void print()
	{
		b.getBookIngo();
	}
}
