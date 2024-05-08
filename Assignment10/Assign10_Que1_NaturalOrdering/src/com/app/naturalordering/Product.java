package com.app.naturalordering;

public class Product implements Comparable<Product>{
	
	public int id;
	public String name;
	public String category;
	public double price;
	
	
	public Product(int id, String name, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}


	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.category.compareTo(o.category);
	}

}
