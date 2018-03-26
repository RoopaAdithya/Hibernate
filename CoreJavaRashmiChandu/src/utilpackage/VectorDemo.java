package utilpackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(12);
		v.add("hello");
		v.add(34.5);
		v.add(true);
		v.add(null);
		v.addElement(56);
		v.addElement(78);
		System.out.println(v);
		v.removeElementAt(2);
		System.out.println(v);
		System.out.println(v.get(4));

		// v.removeAllElements();
		System.out.println(v);

		Enumeration e = v.elements();

		System.out.println("Using Enumeration");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

		}

		System.out.println("Using Iteratorrr");

		Iterator i = v.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Forward Direction Using List Iterator");
		
		ListIterator li=v.listIterator();
		
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
	System.out.println("Backward Direction");
		
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
			
			
			
		}
		
		

	}

}
