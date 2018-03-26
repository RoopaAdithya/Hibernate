package com.siri;

public class BookImpl implements Book {

	private String bname;
	
	
	public void setBname(String bname) {
		this.bname = bname;
	}


	public void getBookIngo() {


		System.out.println("Book Name "+bname);
	}
	
	public void init()
	{
		System.out.println("init() called");
	}
	public void destroy()
	{
		System.out.println("destroy() called");
	}

}
