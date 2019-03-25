package com.capgemini.employeeapp.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.employeeapp.model.CorporateTraining;

class CorporateTrainingTest {

	@Test
	void testPublicTraningCost() {
		CorporateTraining training=new CorporateTraining(101,"Big Data",35000,4);
		assertEquals(140000, training.getOrderValue(),0.01);
	}

}
