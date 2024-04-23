package com.sunbeam.DrivingCost;

import com.sunbeam.Vehicle.Vehicle;

public class DrivingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 Vehicle v1 = new Vehicle();
		 v1.setTotalMilesPerDay(20);
		 v1.setCostperGallon(100);
		 v1.setAvgMilesperGallon(30);
		 v1.setParkingFees(10);
		 v1.setTollsperDay(80);
		 
		 
         double drivingCost = v1.calculateCost();
         
        System.out.println("Your Driving cost Per Day is  :" + drivingCost + "RS." );
		 
		 
	}

}
