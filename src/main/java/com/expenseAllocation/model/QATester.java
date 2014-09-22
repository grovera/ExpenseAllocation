package com.expenseAllocation.model;

public class QATester extends Employee {
	public QATester(Department department){
		setDepartment(department);
		setExpenseAllocation(500);
		setEmployeeType(EmployeeType.QATESTER);
	}
	
	public QATester(){
		setExpenseAllocation(500);
		setEmployeeType(EmployeeType.QATESTER);
	}
}
