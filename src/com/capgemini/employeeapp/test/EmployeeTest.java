package com.capgemini.employeeapp.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employeeapp.model.Employee;

public class EmployeeTest {

	private Employee employee;

	@BeforeEach
	public void setUp() {

		employee = new Employee(101, "John Deo", 20000, 2000);
	}

	@Test
	public void testEmployeeObjectCreatedWithDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);
	}

	@Test
	public void testEmployeeObjectCreatedWithParameterisedConstructor() {
		Employee employee = new Employee(101, "John Deo", 20000, 2000);
		assertNotNull(employee);
		assertEquals(101, employee.getEmployeeId());
		assertEquals("John Deo", employee.getEmployeeName());
		assertEquals(20000, employee.getEmployeeBasicSalary(),0.02);
		assertEquals(2000, employee.getEmployeeMedicalAllowance(),0.02);
	}

	@Test
	public void testEmployeeGrossSalary() {

		assertEquals(32000, employee.calculateEmployeeGrossSalary(), 0.02);
	}

	@Test
	public void testEmployeeNetSalary() {

		assertEquals(27800, employee.calculateNetSalaryOfEmployee(), 0.02);
	}

}
