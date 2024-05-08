package com.app.tester;

import java.util.Arrays;

import com.app.naturalordering.Product;

public class ProductApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product [] arr = { new Product(1, "product1", "tv", 20000.00),
				new Product(2, "product2", "Mobile", 80000.00),
				new Product(3, "product3", "Mouse", 3000.00),
				new Product(4, "product4", "Bottle", 100.00),
				new Product(5, "product5", "watch", 100000.00),
				new Product(6, "product6", "Laptop", 80000.00),
				new Product(7, "product7", "Notebook", 120.00),
				new Product(8, "product8", "Charger", 2000.00),
				new Product(9, "product9", "Optics", 1000.00),
				new Product(10, "product10", "Pen", 200.00),
				
			
		};
		
		System.out.println("BEFORE SORTING...");
		for (Product element : arr) {
			System.out.println("id: " + element.id+" " + "name: "+ element.name+ " " + "category: "+ element.category + " " + "Price: "+ element.price);
		}
		Arrays.sort(arr);
		System.out.println("AFTER SORTING...");
		for (Product element : arr) {
			System.out.println("id: " + element.id+" " + "name: "+ element.name+ " " + "category: "+ element.category + " " + "Price: "+ element.price);
		}
	}

}
