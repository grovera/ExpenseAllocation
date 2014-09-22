package com.expenseAllocation.main;

import com.expenseAllocation.model.Department;
import com.expenseAllocation.model.Employee;
import com.expenseAllocation.model.EmployeeType;
import com.expenseAllocation.model.Manager;

public class Calculator {
		
	public int calculateExpenseAllocation(Manager manager){
		return calculateExpenseAllocation(null, manager);
	}
	
	public int calculateExpenseAllocation(Department department, Manager manager){
		int totalExpenseAllocation = 0;
		if(department == null || (department != null && department.getId() == manager.getDepartment().getId())){
			totalExpenseAllocation = manager.getExpenseAllocation();
		}
		for(Employee employee : manager.getManagerOf()){
			if(employee.getEmployeeType().equals(EmployeeType.DEVELOPER) || employee.getEmployeeType().equals(EmployeeType.QATESTER)){
				if(department == null || (department != null && department.getId() == employee.getDepartment().getId())){
					totalExpenseAllocation = totalExpenseAllocation + employee.getExpenseAllocation();
				}
			}
			else{
				totalExpenseAllocation = totalExpenseAllocation + calculateExpenseAllocation(department, (Manager) employee);
			}
		}	
		return totalExpenseAllocation;
	}

}
