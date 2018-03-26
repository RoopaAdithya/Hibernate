package com.roopa;

public class EmployeeService1 {

	
	
	Employee emp;

	public EmployeeService1(Employee emp) {
		super();
		this.emp = emp;
	}
	
	public void print()
	{
		emp.calculateSal();
	}
	
}
