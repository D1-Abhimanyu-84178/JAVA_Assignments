package com.app.employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee{

	 double wage = 200; // field initializer
	 int hrs;
	 
	 public HourlyEmployee() {
		super();
	 }
	 
	 public HourlyEmployee(String firstName, String lastName, int SSN, double wage, int hrs) {
		 super(firstName, lastName, SSN);
		 this.wage = wage;
		 this.hrs = hrs;
	 }
	 
     @Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		super.accept(sc);
	    System.out.println("Enter hrs: ");
	    hrs = sc.nextInt();
	    
	}
	 
    public void display() {
    	super.display();
    	System.out.println("Salary of Employees is : "+ this.calculateSalary());
    	toString();
    }
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		if(hrs>40) {
			return (wage*hrs) + (hrs-40)*1.5*wage;
		}
		else {
			
			return wage*hrs;
			
		}
	}

	@Override
	public String toString() {
		return " [" + super.toString() +"wage = " + wage + ", hrs =  " + hrs + "]";
	}
}
