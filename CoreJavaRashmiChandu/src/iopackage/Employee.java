package iopackage;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {

	int eid;
	String ename;
	double salary;

	static Scanner sc = new Scanner(System.in);

	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return eid + " " + ename + " " + salary;
	}

	public Employee() {
		super();
	}

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		Employee e = new Employee();

		int ch1 = 1;
		while (ch1 == 1) {

			System.out
					.println("1.Add Employee\n2.View All Employee\n3.Search  Employee");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				e.add();

				break;
			case 2:
				e.getemp();
				break;
			case 3:
				e.getParticular();
				break;

			default:
				System.out.println("Wrong choce");
				break;
			}
			System.out.println("Do u want to continue press 1 else any number");
			ch1 = sc.nextInt();
		}
	}

	public void add() {
		try {
			FileOutputStream fos = new FileOutputStream("emp.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			if (ch == 1) {

				int ch1 = 1;
				while (ch1 == 1) {
					System.out.println("Enter Employee Id");

					int eid = sc.nextInt();
					System.out.println("Enter Employee Name");
					String ename = sc.next();
					System.out.println("Enter Salary");
					double salary = sc.nextDouble();

					Employee e1 = new Employee(eid, ename, salary);
					oos.writeObject(e1);

					System.out
							.println("Do u want to add one more employee press 1 else any number");
					ch1 = sc.nextInt();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void getemp() {
		try {
			FileInputStream fis = new FileInputStream("emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (true) {
				Employee ee = (Employee) ois.readObject();
				
					System.out.println(ee);
				

			}
		} catch (EOFException e) {

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void getParticular() {
		System.out.println("Enter Employee id to search");
		int eid = sc.nextInt();
		try {
			FileInputStream fis = new FileInputStream("emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (true) {
				Employee ee = (Employee) ois.readObject();
				if (ee.eid == eid) {
					System.out.println(ee);
				}

			}
		} catch (EOFException e) {

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}