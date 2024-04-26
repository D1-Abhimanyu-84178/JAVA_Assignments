package com.app.fruits;

public class Orange extends Fruit {

	public Orange() {
		super();
	}
	
	public Orange(String color, double weight, String name) {
		super(color, weight, name);
	}
	
   public String taste() {
	   return "sour";
   }
   
   public String toString() {
	   return "Orange[ color = " + this.color+ " " + "Weight = " + this.weight+ " " + "name = "+ this.name+ " "+ "isFresh = "+ this.isFresh +" " + "]";
   }
}
