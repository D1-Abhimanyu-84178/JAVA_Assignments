package com.app.employee;

import java.util.Scanner;

public class BaseSalariedCommisionEmployee extends CommisionEmployee {

	double base_salary;
//	Scanner sc  = new Scanner(System.in); // did it to call calculateSalary with passing sc as argument
	public BaseSalariedCommisionEmployee() {
		super();
	}
	
	public BaseSalariedCommisionEmployee(String firstName, String lastName, int SSN, int grossSales,  double base_salary) {
		super(firstName, lastName, SSN, grossSales);
		
		this.base_salary = base_salary;
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter base_salary: ");
		base_salary = sc.nextDouble();
	}
	
	public void display() {
		super.display();
		System.out.println("Salary of Employee is:  " + calculateSalary(/*sc*/));
	}


	@Override
	public String toString() {
		return "[" + super.toString()+"base_salary = " + base_salary + "]";
	}

	@Override
	public double calculateSalary(Scanner sc) {
		// TODO Auto-generated method stub
//		if(base_salary == 0.0) {
//			this.accept(sc);	
//		}
//	    System.out.println("im in base salaried commision employee's calculate salary method");
		return grossSales*commisionRate + base_salary;
	}
	
}
