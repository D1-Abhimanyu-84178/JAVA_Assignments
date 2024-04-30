package com.app.employee;

import java.util.Scanner;

public class SalariedEmployee extends Employee{

	double weeklySalary;

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(String firstName, String lastName, int SSN, double weeklySalary) {
		// TODO Auto-generated constructor stub
		super(firstName, lastName, SSN);
		weeklySalary = this.weeklySalary;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}	
	
	public void accept(Scanner sc) {
		super.accept(sc);
	    System.out.println("Enter weekly salary: ");
	    weeklySalary = sc.nextDouble();
	}
	
	public void display() {
		super.display();
		System.out.println("Weekly Salary of Employee is: " + calculateSalary());
	}

	@Override
	public String toString() {
		return "[" + super.toString() + " weeklySalary = " + weeklySalary + "]";
	}
}
