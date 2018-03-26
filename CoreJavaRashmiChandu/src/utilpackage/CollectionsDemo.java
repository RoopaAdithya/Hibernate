package utilpackage;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {


		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(4);
		al.add(34);
		al.add(3);
		System.out.println("Array List");
		System.out.println(al);
		

		Collections.sort(al);
		System.out.println("Ascending order");
		System.out.println(al);
		
		MyComparator m=new MyComparator();
		System.out.println("Descending order");
		Collections.sort(al, m);
		
		System.out.println(al);
		
		
		
		
		
		
		
	}

}
