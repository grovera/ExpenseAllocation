package com.expenseAllocation.model;

import java.util.HashSet;
import java.util.Set;

public class Manager extends Employee {
	private Set<Employee> managerOf = new HashSet<Employee>();
	
	public Set<Employee> getManagerOf() {
		return managerOf;
	}

	public void setManagerOf(Set<Employee> managerOf) {
		this.managerOf = managerOf;
	}

	public Manager(Department department){
		setDepartment(department);
		setExpenseAllocation(300);
		setEmployeeType(EmployeeType.MANAGER);
	}
	
	public Manager(){
		setExpenseAllocation(300);
		setEmployeeType(EmployeeType.MANAGER);
	}
}
