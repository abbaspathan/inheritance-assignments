package com.capgemini.employeeapp.model;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double employeeBasicSalary;
	private double employeeMedicalAllowance;

	public Employee() {
		super();

	}

	public Employee(int employeeId, String employeeName, double employeeBasicSalary, double employeeMedicalAllowance) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeBasicSalary = employeeBasicSalary;
		this.employeeMedicalAllowance = employeeMedicalAllowance;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeBasicSalary() {
		return employeeBasicSalary;
	}

	public void setEmployeeBasicSalary(double employeeBasicSalary) {
		this.employeeBasicSalary = employeeBasicSalary;
	}

	public double getEmployeeMedicalAllowance() {
		return employeeMedicalAllowance;
	}

	public void setEmployeeMedicalAllowance(double employeeMedicalAllowance) {
		this.employeeMedicalAllowance = employeeMedicalAllowance;
	}

	public double calculateEmployeeGrossSalary() {

		double grossSalary = employeeBasicSalary + (0.50 * employeeBasicSalary) + employeeMedicalAllowance;
		return grossSalary;
	}

	public double calculateNetSalaryOfEmployee() {

		double netSalary = calculateEmployeeGrossSalary() - (200 + (0.20 * employeeBasicSalary));
		return netSalary;
	}

}
