package com.app.Tester;

import java.util.Scanner;

import com.app.circle.Circle;
import com.app.circle.NegativeDiameterException;

public class MainApplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Circle newCircle = new Circle();
		System.out.println("Enter the Diameter of Circle: ");
		try {
			newCircle.setMyDiameter(sc.nextDouble());
			
			System.out.println("x: "+ newCircle.getX());
			System.out.println("y: " +newCircle.getY());
			
		}catch(NegativeDiameterException e) {
//			System.out.println(" ");
			e.printStackTrace();
		}

	}

}
