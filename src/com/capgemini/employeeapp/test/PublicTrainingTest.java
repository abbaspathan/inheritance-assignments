package com.capgemini.employeeapp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.employeeapp.model.PublicTraining;

class PublicTrainingTest {

	@Test
	void testCorporateTrainingCostValue() {
		PublicTraining publicTraining = new PublicTraining(102, "Java", 5000, 50);

		assertEquals(250000, publicTraining.getOrderValue(),0.01);
	}

}
