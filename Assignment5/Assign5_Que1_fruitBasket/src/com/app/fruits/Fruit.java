package com.app.fruits;

public class Fruit {

	String color;
	double weight;
	String name;
	boolean isFresh;
	
	public Fruit(){
		color = "";
		weight = 0.0;
		name = "";
		isFresh = true;
		
	}
	
	public Fruit(String color, double weight, String name) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = true;
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
	public String taste() {
		return "no specific taste";
		
	}

	@Override
	public String toString() {
		return "Fruit [color=  " + color+ " " + ", weight= " + weight + " " + ", name=" + name+ " " + ", isFresh=" + isFresh+ " " + "]";
	}

	

	
	
  
}
