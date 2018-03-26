package iopackage;

import java.io.Serializable;

public class Student implements Serializable {
	
	
	 int sid;
	 String sname;
	transient int marks;
	 String address;
	public Student(int sid, String sname, int marks, String address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
		this.address = address;
	}
	@Override
	public String toString() {
		return  sid+" "+sname+" "+marks+" "+address;
	}
	
	
	
	
	
	

}
