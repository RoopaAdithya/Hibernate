package utilpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		MyComparator m = new MyComparator();
		TreeSet t = new TreeSet();
		t.add(23);
		t.add(11);
		t.add(5);
		t.add(100);
		t.add(1);
		System.out.println(t);
		
		System.out.println("First ="+t.first());
		System.out.println("Last ="+t.last());
		System.out.println("Head set" +t.headSet(23));
		System.out.println("Tail Set ="+t.tailSet(23));
		System.out.println("Sub set ="+t.subSet(11, 100));
		

		TreeSet t1 = new TreeSet<>();
		t1.add("hello");
		t1.add("hi");
		t1.add("A");
		t1.add("Ball");
		t1.add("PQR");
		t1.add("Jai");
		System.out.println(t1);
		System.out.println("**************");
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		int k = 0;
		Integer i = (Integer) o1;
		Integer j = (Integer) o2;

		if (i > j)
			k = k - 10;

		else if (i < j)
			k = k + 10;
		else
			k = 0;
		return k;
	}

}
