package utilpackage;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		MyComparator m=new MyComparator();

		
		TreeMap t=new TreeMap<>(m);
		t.put(11, "Oracle");
		t.put(3, "C++");
		t.put(100,"Java");
		t.put(7,"PHP");
		System.out.println(t);
		
		TreeMap<String,Boolean> t1=new TreeMap<>();
		t1.put("one", true);
		t1.put("Three",true);
		t1.put("Two",false);
		System.out.println(t1);
		
		
		
		
	}

}
