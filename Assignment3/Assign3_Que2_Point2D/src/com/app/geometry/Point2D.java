package com.app.geometry;

public class Point2D {

	int x;
	int y;
	
	public Point2D( ) {
	    x = 0;
		y = 0;
	}
	public Point2D(int x, int y ) {
		this.x = x;
		this.y = y;
	}
	public String getDetails() {
		String pointDetails = "("+this.x + ","+ this.y+")";
		return pointDetails;
		
	}
	
	public static boolean isEqual(Point2D p1, Point2D p2) {
		if((p1.x==p2.x)&&(p1.y == p2.y)) {
		return true;	
		}
		else {
			return false;
		}	
	}
	
	public static void calculateDistance(Point2D p1, Point2D p2) {
		
		double pointDistance = Math.sqrt(Math.pow(p1.x - p2.y, 2)+ Math.pow(p2.x - p2.y, 2));
		System.out.println("distance between two points is "+ pointDistance);
	}
	
	
	
}
