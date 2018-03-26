package utilpackage;

import iopackage.Student;

import java.util.LinkedHashSet;

public class LinkedHashSetBemo {

	public static void main(String[] args) {


		Integer i=new Integer(100);
		Student s=new Student(100, "Kiran", 20, "Hyd");
		LinkedHashSet l=new LinkedHashSet();
		l.add(123);
		l.add(i);
		l.add(null);
		l.add(true);
		l.add("hello");
		l.add(s);
		System.out.println(l);
		
	}

}
