package utilpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		
		ArrayList<Integer> al3=new ArrayList<Integer>();

		
		Student s=new Student(100, "Kiran", 23);
		Student s1=new Student(101, "Pooja", 20);

		ArrayList al=new ArrayList();  //10   10+3/2+1
		
		al.add(s);
		al.add(s1);
		al.add(20);
		al.add(20.5);
		al.add(20);
		al.add("absent");
		al.add(null);
		al.add(13.5);
		System.out.println(al);
		
		System.out.println(al.get(3));
		
		System.out.println(al.contains(21));
		al.add(4, 40);
		
		System.out.println(al);
		
		al.remove(null);
		System.out.println(al);
		
		
		
		ArrayList al1=new ArrayList<>();
		al1.addAll(al);
		
		System.out.println("Al1 ="+al1);
		
		al1.add("Raju");
	
		System.out.println(al1);
		
		al1.retainAll(al);
		
		System.out.println("AL ="+al);
		System.out.println("Al1 ="+al1);
		
		System.out.println("*******Using Iterator *************");
		Iterator i=al1.iterator();
		
		while(i.hasNext())
		{
			//System.out.println(i.next());
			
			
			if(i.next().equals("absent"))
			{
				i.remove();
			}
		}
		
		System.out.println("After reoving AL1 ="+al1);

	}

}

class Student
{
	int sid; 
	String sname;
	int marks;
	public Student(int sid, String sname, int marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return sid+" "+sname+" "+marks;
	}
	
	
	
}
