package utilpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {

	public static void main(String[] args) {


		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(12);
		al.add(100);
		al.add(55);
		
		
		ArrayList<String> al1=new ArrayList<>();
		
		al1.add("Abc");
		al1.add("hello");
		al1.add("Ram");
		
		
		Employee e1=new Employee(101, "Kiran", 15000);
		Employee e2=new Employee(103, "Pooja", 15000);
		
		ArrayList<Employee> al2=new ArrayList<>();
		
		al2.add(new Employee(100, "Ram", 13000));
		al2.add(e1);
		al2.add(e2);
		
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al2);
		
		System.out.println("*********************");
		Iterator<Employee> i=al2.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
	}

}

class Employee
{
	int eid;
	String ename;
	double salary;
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return  eid+" "+ename+" "+salary;
	}
	
	
	
}
