package com.siri;

public class EmployeeService {
	
	Employee emp;
	
	
	public void setEmp(Employee emp) {
		this.emp = emp;
	}


	public void getEmpInfo()
	{
		emp.calculateSalary();
	}

}
