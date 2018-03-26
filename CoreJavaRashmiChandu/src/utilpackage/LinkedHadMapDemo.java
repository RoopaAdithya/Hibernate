package utilpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHadMapDemo {

	public static void main(String[] args) {


		LinkedHashMap l=new LinkedHashMap<>();
		l.put(1,"Java");
		l.put("two", "Oracle");
		l.put(null, null);
		l.put(1, "C");
		System.out.println(l);
		
		Set s=l.keySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Set ss=l.entrySet();
		
		Iterator i1=ss.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println(l.containsKey(10));
		
	}

}
