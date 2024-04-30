package com.app.employee;

import java.util.Scanner;

public abstract class Employee {

	@Override
	public String toString() {
		return "Employee [firstName = " + firstName + ", lastName = " + lastName + ", SSN = " + SSN + "]";
	}

	String firstName;
	String lastName;
	int SSN;
	
	public Employee() {
		
	}
    
	public Employee(String firstName, String lastName, int SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}
	
	public void accept(Scanner sc) {

	   System.out.println("Enter Firstname Of Employee: ");
	   firstName = sc.next();
	   System.out.println("Enter you lastName of Employee: ");
	   lastName = sc.next();
	   System.out.println("Enter SSN of Employee: ");
	   SSN = sc.nextInt();
	}
	
	public void display() {
		System.out.println("FirstName of Employee is: " + firstName);
		System.out.println("LastName of Employee is : "+ lastName);
		System.out.println("SSN of Employee is: "+ SSN);
	}
	
	public abstract double calculateSalary();
}
