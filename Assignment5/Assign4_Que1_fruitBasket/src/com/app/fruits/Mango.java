package com.app.fruits;

public class Mango extends Fruit {

	public Mango() {
		
	}
	
	public Mango(String color, double weight, String name) {
     super(color, weight, name);
	}
	
	public String taste() {
		return "sweet";
	}
	
	public String toString() {
		return "Mango[ color = " + this.color+"  " + "Weight = " + this.weight+ "  " + "name = "+ this.name+"  " + "isFresh = "+ this.isFresh+ " " + "]";
	}
}
