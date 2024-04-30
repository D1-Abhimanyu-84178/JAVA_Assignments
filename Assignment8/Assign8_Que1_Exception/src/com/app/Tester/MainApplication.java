package com.app.Tester;

import java.util.Scanner;

import com.app.Exception.StringLength;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringLength string = new StringLength();
		System.out.println("***  ...STRING LENGTH CHECKAR...  ***");
		System.out.println("Tip: length of the string should less than 80 characters");
		System.out.println("Enter the String: ");
	    string.setUserString(sc.nextLine());
	    string.checkLength();
		

	}

}
