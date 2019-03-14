package com.capgemini.employeeapp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employeeapp.model.Manager;

class ManagerTest {
	
	Manager manager;

	@BeforeEach
	public void setUp() {
		manager=new Manager(101, "John Deo", 20000, 2000);
	}
	
	@Test
	public void testManagerGrossSalary() {
		assertEquals(36800,manager.calculateEmployeeGrossSalary(),0.02);
	}
	
	@Test
	public void testManagerNetSalary() {
		assertEquals(32600,manager.calculateNetSalaryOfEmployee(),0.02);
	}
}
