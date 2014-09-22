package com.expenseAllocation.model;

public class Developer extends Employee {
	public Developer(Department department){
		setDepartment(department);
		setExpenseAllocation(1000);
		setEmployeeType(EmployeeType.DEVELOPER);
	}
	
	public Developer(){
		setExpenseAllocation(1000);
		setEmployeeType(EmployeeType.DEVELOPER);
	}
}
