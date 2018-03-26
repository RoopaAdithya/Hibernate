package com.daoimpl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.beans.StudentBean;
import com.dao.StudentDao;

public class StudentDaoimpl implements StudentDao {

	Scanner sc = new Scanner(System.in);
	FileInputStream fis = null;
	FileOutputStream fos = null;
	ObjectInputStream ois = null;
	ObjectOutputStream oos = null;

	@Override
	public void addStudent() {

		
		ArrayList<StudentBean> al = new ArrayList<>();
		try {

			fos = new FileOutputStream("studentdetails.ser");
			oos = new ObjectOutputStream(fos);

			int ch = 1;
			while (ch == 1) {
				StudentBean sb = new StudentBean();
				System.out.println("Enter Studnet Id");
				sb.setSid(sc.nextInt());
				System.out.println("Entre Name");
				sb.setStudentName(sc.next());
				System.out.println("Enter Address");
				sb.setAddress(sc.next());

				System.out.println("Enter Mobile Numner");
				sb.setMobileNo(sc.nextLong());
				System.out.println("Enter Subject1 Marks");
				sb.setSub1(sc.nextInt());

				System.out.println("Enter Subject2 Marks");
				sb.setSub2(sc.nextInt());
				System.out.println("Enter Subject3 Marks");
				sb.setSub3(sc.nextInt());

				
				System.out
						.println("Do u want to cotinue press 1 else any number");
				ch = sc.nextInt();
				al.add(sb);
				System.out.println("Student Added");
			}
			oos.writeObject(al);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void viewAllStudents() {

		try {
			fis = new FileInputStream("studentdetails.ser");
			ois = new ObjectInputStream(fis);

			ArrayList<StudentBean> al = (ArrayList<StudentBean>) ois
					.readObject();

			Iterator<StudentBean> i = al.iterator();
System.out.println("Sid\tSName\tAddress\tMobileNo\tSub1\tSub2\tSub3");
System.out.println("------------------------------------------------------------------------------");
			while (i.hasNext()) {
				StudentBean s = i.next();

				System.out.println(s.getSid() + "\t" + s.getStudentName() + "\t"
						+ s.getAddress() + "\t" + s.getMobileNo() + "\t"
						+ s.getSub1() + "\t" + s.getSub2() + " " + s.getSub3());

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void viewParticularStudent() {

		System.out.println("Enter Sid");
		int sid = sc.nextInt();

		StudentBean s = null;
		try {
			fis = new FileInputStream("studentdetails.ser");
			ois = new ObjectInputStream(fis);

			ArrayList<StudentBean> al = (ArrayList<StudentBean>) ois
					.readObject();

			Iterator<StudentBean> i = al.iterator();

			while (i.hasNext()) {
				StudentBean ss = i.next();
				if (sid == ss.getSid()) {
					s = ss;
					break;
				}

				else {
					s = null;
				}
			}
			if (s != null) {
				System.out.println("Student Id :"+s.getSid() + "\nStudent Name :" + s.getStudentName() + "\nAddress : "
						+ s.getAddress() + "\nMobile No :" + s.getMobileNo() + "\nSub1: "
						+ s.getSub1() + "\nSub2 :" + s.getSub2() + "\nSub3 :" + s.getSub3());
			}
			else
			{
				System.out.println("Student Not Existed");
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
