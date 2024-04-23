//Q2. Create an application that calculates your daily driving cost, so that you can estimate how much 
//money could be saved by car pooling, which also has other advantages such as reducing carbon 
//emissions and reducing traffic congestion. The application should input the following information 
//and display the user’s cost per day of driving to work:
//a) Total miles driven per day.
//b) Cost per gallon of gasoline.
//c) Average miles per gallon.
//d) Parking fees per day.
//e) Tolls per day

package com.sunbeam.Vehicle;

public class Vehicle {
  
	double totalMilesPerDay;
	double costperGallon;
    double avgMilesperGallon;
    int parkingFees;
    int tollsperDay;
    double totalRunning; // to calculate total cost of vehicle per day for running
	double overallCost; // to calculate overall cost
	
	
 public double calculateCost() {
	  // 20 km  100rs/L  avg = 40km/L  20/40L 1/2* 100
	  // total running = totalmiles/avgmiles * costperGallon  
         System.out.println(totalMilesPerDay);
         System.out.println(avgMilesperGallon);
         System.out.println(costperGallon);
         
	     totalRunning = (totalMilesPerDay/avgMilesperGallon) * costperGallon;
	     System.out.println(totalRunning);
	     overallCost = totalRunning + tollsperDay + parkingFees;
	return overallCost;
	   
   }


public void setTotalMilesPerDay(int totalMilesPerDay) {
	this.totalMilesPerDay = totalMilesPerDay;
}


public void setCostperGallon(int costperGallon) {
	this.costperGallon = costperGallon;
}


public void setAvgMilesperGallon(int avgMilesperGallon) {
	this.avgMilesperGallon = avgMilesperGallon;
}


public void setParkingFees(int parkingFees) {
	this.parkingFees = parkingFees;
}


public void setTollsperDay(int tollsperDay) {
	this.tollsperDay = tollsperDay;
}
}
