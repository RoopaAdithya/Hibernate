package utilpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {


		
		
	HashMap hm=new HashMap<>();
	
	
	
	hm.put(1,"Raju"); //Entry
	hm.put("two","Kiran");
	hm.put(true, 1234566);
	hm.put(1, "Ram");
	hm.put("three", "Jai");
	hm.put(null, 123);
	
	System.out.println(hm);
	
	System.out.println(hm.containsKey(100));
	System.out.println(hm.containsValue("Ram"));
	hm.remove(1);
	
	System.out.println("After Removing ="+hm);
	
	System.out.println(hm.isEmpty());
	
	System.out.println(hm.size());
	
	System.out.println("********Keys **************");
				
		Set s=hm.keySet();
		
		Iterator i=s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	System.out.println("********** Values **********");
	
				Collection c=hm.values();
	
				Iterator i1=c.iterator();
				
				while(i1.hasNext())
				{
					System.out.println(i1.next());
				}
	
		System.out.println("********** Entries *************");
		
						Set ss=hm.entrySet();
						
						
						Iterator i2=ss.iterator();
						
						while(i2.hasNext())
						{
							System.out.println(i2.next());
						}
		
	}

}
