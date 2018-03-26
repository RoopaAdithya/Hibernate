package com.controller;

import java.util.Scanner;

import com.daoimpl.StudentDaoimpl;

public class StudentProjectMenu {

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {
		
		int ch1=1;
		while(ch1==1)
		{
		System.out
				.println("1.Add Student\n2.View All Students\n3.View Particular Student");

		Scanner sc = new Scanner(System.in);

		StudentDaoimpl s = new StudentDaoimpl();
		int ch = sc.nextInt();

		
		switch (ch) {
		case 1:
			s.addStudent();

			break;

		case 2:
			s.viewAllStudents();
			break;
		case 3:
			s.viewParticularStudent();
			break;
		default:
			System.out.println("Wrong Choice");
			break;
		}
		System.out.println("Do u want to continue press 1 else any number");
		ch1=sc.nextInt();
		}

	}

}
