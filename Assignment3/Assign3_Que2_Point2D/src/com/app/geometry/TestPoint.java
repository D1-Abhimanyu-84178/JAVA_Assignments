package com.app.geometry;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D(10, 20);
		
		Point2D p2 = new Point2D(10, 20);
		
		boolean checkposition = Point2D.isEqual(p1, p2);
		if(checkposition == true) {
			System.out.println("p1 & p2 are located at the same position");
			String details = p1.getDetails();
			System.out.println(details);
		}
		else {
			Point2D.calculateDistance(p1, p2);
		}

	}

}
