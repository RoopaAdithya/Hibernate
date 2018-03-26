package utilpackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {


		LinkedList l=new LinkedList();
		
		l.add(20);
		l.add(40);
		l.add("Raju");
		l.add(null);
		l.add(20);
		System.out.println(l);
		
		l.addFirst(100);
		l.addLast(1000);
		
		System.out.println(l);
		l.removeFirst();
		System.out.println("After Remove first Object="+l);
		
		l.removeLast();
		
		System.out.println("After Remove Last Object="+l);
		
		System.out.println("First ="+l.getFirst());
		
		System.out.println("Last ="+l.getLast());

		
		
		Iterator i=l.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
