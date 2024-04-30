package com.app.employee;

import java.util.Scanner;

public class CommisionEmployee extends Employee{

	int grossSales;
	int commisionRate = 20; //field initializer
	
	public CommisionEmployee() {
		super();
	}

	public CommisionEmployee(String firstName, String lastName, int SSN, int grossSales) {
		super(firstName, lastName, SSN);
		// TODO Auto-generated constructor stub
		this.grossSales = grossSales;
//		this.commisionRate = commisionRate;
	}
	
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter grossSales :  " );
		grossSales = sc.nextInt();
//		System.out.println("Enter CommisionRate: ");
//		commisionRate = sc.nextInt();
		
	}
    
	public void display() {
		super.display();
		System.out.println("Gross Sales of Employee are: " + grossSales);
		System.out.println("Commision Rate of Employee: " + commisionRate);
		System.out.println("Salary of Commision Employee: "+ this.calculateSalary());
		toString();
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return grossSales*commisionRate;
	}

	public double calculateSalary(Scanner sc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "[" + super.toString() +"grossSales = " + grossSales + ", commisionRate = " + commisionRate + "]";
	}
	
	
	
}