package com.capgemini.employeeapp.model;

public class CorporateTraining extends Training {

	private int days;

	public CorporateTraining() {
		super();
	}

	public CorporateTraining(int traningId, String subject, double fees, int days) {
		super(traningId, subject, fees);
		this.days = days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getOrderValue() {
		return getFees() * days;
	}
}
