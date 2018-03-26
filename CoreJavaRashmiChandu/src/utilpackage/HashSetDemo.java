package utilpackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	
	public static void main(String ar[])
	{
		
		
		HashSet h=new HashSet<>();
		
		h.add(10);
		h.add(10);
		h.add("Ram");
		h.add(12345);
		h.add(true);
		h.add(12.3);
		h.add(null);
		
		System.out.println(h);
		
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Object existed ="+h.contains("ram"));
		h.remove(null);
		System.out.println(h);
		
		
	}
}
