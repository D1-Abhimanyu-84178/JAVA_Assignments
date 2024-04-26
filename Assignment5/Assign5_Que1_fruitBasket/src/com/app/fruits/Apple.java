package com.app.fruits;

public class Apple extends Fruit {
	
	public Apple() {
		super();
	}

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}
	
	
    public String taste() {
    	return "sweet n sour";
    }
     
    public String toString() {
    	
    	return "Apple[ color = " + this.color+ " " + "Weight = " + this.weight+ " " + "name = "+ this.name+ " "+ "isFresh = "+ this.isFresh+ " " + "]"; 
    }
}
