package com.siri;

public class EmployeeServiceConstructorInjection {

	
	Employee emp1;

	public EmployeeServiceConstructorInjection(Employee emp1) {
		super();
		this.emp1 = emp1;
	}
	
	public void print()
	{
		emp1.calculateSalary();
	}
	
	
}
