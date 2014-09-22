package com.expenseAllocation.model;

public class Employee {
	
	private Department department;
	private int expenseAllocation;
	private EmployeeType employeeType;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public int getExpenseAllocation() {
		return expenseAllocation;
	}
	public void setExpenseAllocation(int expenseAllocation) {
		this.expenseAllocation = expenseAllocation;
	}
	
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
}
