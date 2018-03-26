package com.roopa;

public class EmployeeService {

	Employee emp;

	

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public void print()
	{
		
		emp.calculateSal();
	}
	
	
	
}
