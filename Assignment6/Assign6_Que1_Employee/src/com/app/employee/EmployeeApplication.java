package com.app.employee;

import java.util.Scanner;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of Employees: ");
		
		Employee [] employees = new Employee[sc.nextInt()];
		
		int choice=0;
		int count=0;
		do {
			
			System.out.println("0. EXIT ");
			System.out.println("1. Do Calculation For Salaried Employee: ");
			System.out.println("2. Do Calculation For Hourly Employee: ");
			System.out.println("3. Do Calculation For Commision Employee: ");
			System.out.println("4. Do Calculation For Base Salaried Commision Employee: ");
			System.out.println("5. Display Details All Employees: ");
			System.out.println("Enter Your Choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Exit form Application.........");
				
				break;
			case 1:
				if(count<employees.length) {
					
					employees[count] = new SalariedEmployee();
					employees[count].accept(sc);
					employees[count].display();
					System.out.println();
					System.out.println("*********************************");
					count++;
				}
				else {
					System.out.println("Count of Employees is Reached to end.... :)");
				}
				break;
			case 2:
				if(count<employees.length) {
					employees[count] = new HourlyEmployee();
					employees[count].accept(sc);
					employees[count].display();
					System.out.println();
					System.out.println("*********************************");
					System.out.println();
					count++;			
				}
				else {
					
					System.out.println("Count of Employees is Reached to end.... :)");
				}
				break;
			case 3:
				if(count < employees.length) {
					
					employees[count] = new CommisionEmployee();
					employees[count].accept(sc);
//					employees[count].calculateSalary();
					employees[count].display();
					System.out.println();
					System.out.println("*********************************");
					System.out.println();
					count++;	
				}
				else {
					
					System.out.println("Count of Employees is Reached to end.... :)");
				}
				break;
			case 4:
				if(count<employees.length) {
					
					employees[count] = new BaseSalariedCommisionEmployee();
					employees[count].accept(sc);
//					BaseSalariedCommisionEmployee bse = (BaseSalariedCommisionEmployee)employees[count];
//					bse.calculateSalary(sc);
					employees[count].display();
					System.out.println();
					System.out.println("*********************************");
					System.out.println();
					count++;		
				}
				else {
					
					System.out.println("Count of Employees is Reached to end.... :) ");
				}
				break;
			case 5:
				if(count == 0) {
					System.out.println("No any Employee Exist... (-_-)");
				}
				else {
					for (Employee employee : employees) {
						
						if(employee!=null) {
							employee.display();
							System.out.println();
							System.out.println();
							System.out.println(employee);
							System.out.println();
							System.out.println("---------------------------------------------***---------------------------------------------");
							System.out.println();
						}
				}
				}
					
					System.out.println();
				break;
			default:
				break;
			}
		} while (choice !=0);
	}

}
