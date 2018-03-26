package utilpackage;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {


		Stack s=new Stack();
		s.push(10);
		s.push(23);
		s.add(78);
		s.add("hello");
		s.add(true);
		s.add(23.55);
		s.addElement(30);
		
		System.out.println(s.peek());
		
		System.out.println(s);
		
		
		s.pop();
		
		System.out.println(s);
		
		s.pop();
		s.pop();
		System.out.println(s);
		
		System.out.println(s.search("hello"));
		
		System.out.println(s.get(3));
		
		
		
		System.out.println(s);
		
		s.remove(3);
		System.out.println(s);
		
		
		System.out.println(s.search(100));
		
		Enumeration e=s.elements();
		System.out.println("Using Enumeration");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		
		
	}

}

