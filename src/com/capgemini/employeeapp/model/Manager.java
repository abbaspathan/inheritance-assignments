package com.capgemini.employeeapp.model;

public class Manager extends Employee {
	
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	

	public Manager() {
		super();
		
	}

	public Manager(int employeeId, String employeeName, double employeeBasicSalary, double employeeMedicalAllowance) {
		super(employeeId, employeeName, employeeBasicSalary, employeeMedicalAllowance);
		this.petrolAllowance=0.08*employeeBasicSalary;
		this.foodAllowance=0.13*employeeBasicSalary;
		this.otherAllowance=0.03*employeeBasicSalary;
	}

	public double getPetrolAllowance() {
		return petrolAllowance;
	}

	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}

	public double getFoodAllowance() {
		return foodAllowance;
	}

	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}

	public double getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	
	@Override
	public double calculateEmployeeGrossSalary() {
		
		double grossSalary=super.calculateEmployeeGrossSalary()+petrolAllowance+foodAllowance+otherAllowance;
		
		return grossSalary;
	}

}
