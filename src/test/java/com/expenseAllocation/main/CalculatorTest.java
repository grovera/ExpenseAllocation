package com.expenseAllocation.main;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.expenseAllocation.model.Department;
import com.expenseAllocation.model.Developer;
import com.expenseAllocation.model.Manager;
import com.expenseAllocation.model.QATester;

public class CalculatorTest {

	@Test
	public void testCalculateExpenseAllocationUnderManager() {
		Calculator test = new Calculator();
		Manager manA = new Manager();
		Manager manB = new Manager();
		manA.getManagerOf().add(manB);
		Developer dev = new Developer();
		QATester qa = new QATester();
		manB.getManagerOf().add(dev);
		manB.getManagerOf().add(qa);
		Assert.assertEquals(test.calculateExpenseAllocation(manA), 2100);

	}
	
	@Test
	public void testCalculateExpenseAllocationUnderDepartment() {
		Department dept1 = new Department(1, "IT");
		Department dept2 = new Department(2, "Development");
		Calculator test = new Calculator();
		Manager manA = new Manager(dept2);
		Manager manB = new Manager(dept1);
		manA.getManagerOf().add(manB);
		Developer dev = new Developer(dept1);
		QATester qa = new QATester(dept1);
		manB.getManagerOf().add(dev);
		manB.getManagerOf().add(qa);
		Assert.assertEquals(test.calculateExpenseAllocation(dept1, manA), 1800);
	}

}
