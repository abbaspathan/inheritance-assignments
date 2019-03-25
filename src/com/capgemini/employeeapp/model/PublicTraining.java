package com.capgemini.employeeapp.model;

public class PublicTraining extends Training {

	private int participants;

	public PublicTraining() {
		super();
	}

	public PublicTraining(int traningId, String subject, double fees, int participants) {
		super(traningId, subject, fees);
		this.participants = participants;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}
	@Override
	public double getOrderValue() {

		return getFees() * participants;
	}
}
