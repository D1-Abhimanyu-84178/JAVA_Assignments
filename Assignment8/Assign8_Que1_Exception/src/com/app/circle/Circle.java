package com.app.circle;

public class Circle {

	private int x;
	private int y;
	private double myDiameter;
	
	public Circle() {
	    Point2D point = new Point2D();
		myDiameter = 100;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setMyDiameter(double myDiameter) throws NegativeDiameterException {
		
		if(myDiameter < 0) {
			throw new NegativeDiameterException("Value of Diameter Should be Non-Negative");
		}
		else {
			
			this.myDiameter = myDiameter;
			System.out.println("Successfully Set Diameter of Circle: " + myDiameter);
		}
	}
}
