package com.capgemini.employeeapp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.employeeapp.model.MarketingExecutive;

class MarketingExecutiveTest {

	MarketingExecutive executive;

	@BeforeEach
	public void setUp() {

		executive = new MarketingExecutive(101, "John Deo", 20000, 2000,123);
	}
	
	@Test
	public void testMarketingExecutiveGrossSalary() {
		assertEquals(34115,executive.calculateEmployeeGrossSalary(),0.02);
	}
	
	@Test
	public void testMarketingExecutiveNetSalary() {
		assertEquals(29915,executive.calculateNetSalaryOfEmployee(),0.02);
	}
}
