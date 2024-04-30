package com.app.circle;

public class Point2D {

	private int x;
	private int y;
	
	public Point2D( ) {
	    setX(0);
		setY(0);
	}
	public Point2D(int x, int y ) {
		this.setX(x);
		this.setY(y);
	}
	public String getDetails() {
		String pointDetails = "("+this.getX() + ","+ this.getY()+")";
		return pointDetails;
		
	}
	
	public static boolean isEqual(Point2D p1, Point2D p2) {
		if((p1.getX()==p2.getX())&&(p1.getY() == p2.getY())) {
		return true;	
		}
		else {
			return false;
		}	
	}
	
	public static void calculateDistance(Point2D p1, Point2D p2) {
		
		double pointDistance = Math.sqrt(Math.pow(p1.getX() - p2.getY(), 2)+ Math.pow(p2.getX() - p2.getY(), 2));
		System.out.println("distance between two points is "+ pointDistance);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
