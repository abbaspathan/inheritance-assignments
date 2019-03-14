package com.capgemini.employeeapp.model;

public class MarketingExecutive extends Employee {

	private double kilometerTraveled;
	private double tourAllowance;
	private static final double telephoneAllowance=1500;

	public MarketingExecutive() {
		super();
	}

	public MarketingExecutive(int employeeId, String employeeName, double employeeBasicSalary,
			double employeeMedicalAllowance,double kilometerTraveled) {
		super(employeeId, employeeName, employeeBasicSalary, employeeMedicalAllowance);

		this.kilometerTraveled=kilometerTraveled;
		this.tourAllowance=5*kilometerTraveled;
		
	}

	public double getKilometerTraveled() {
		return kilometerTraveled;
	}

	public void setKilometerTraveled(double kilometerTraveled) {
		this.kilometerTraveled = kilometerTraveled;
	}

	public double getTourAllowance() {
		return tourAllowance;
	}

	public void setTourAllowance(double tourAllowance) {
		this.tourAllowance = tourAllowance;
	}

	public double getTelephoneAllowance() {
		return telephoneAllowance;
	}

	public void setTelephoneAllowance(double telephoneAllowance) {
		telephoneAllowance = telephoneAllowance;
	}
	
	@Override
	public double calculateEmployeeGrossSalary() {
	
		double grossSalary=super.calculateEmployeeGrossSalary()+tourAllowance+telephoneAllowance;
		return grossSalary;
	}

}
