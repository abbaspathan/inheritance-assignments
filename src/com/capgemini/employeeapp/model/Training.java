package com.capgemini.employeeapp.model;

public class Training {

	private int traningId;
	private String subject;
	private double fees;

	public Training() {
		super();

	}

	public Training(int traningId, String subject, double fees) {
		super();
		this.traningId = traningId;
		this.subject = subject;
		this.fees = fees;
	}

	public int getTraningId() {
		return traningId;
	}

	public void setTraningId(int traningId) {
		this.traningId = traningId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
}
