package com.app.reverse;

public class ReverseString {

	public static void main(String[] args) {
			
     	StringBuffer myString1 = new StringBuffer("Mr.RohanParamane");
		
     	System.out.println("String Before Reverse: ");
     	System.out.println(myString1);
//		StringBuffer myNewString = new StringBuffer();
//	     myString1.reverse();
//		System.out.println("Reversed String is : " +  myString1.reverse());
//		System.out.println("Reversed String is : " + myNewString);
		
//		for(int i= myString1.length()-1; i>=0; i--) {
//		 
//			myNewString.append(myString1.charAt(i));
//		}
//		System.out.println("Reversed String is : " + myNewString);
		
		int left = 0;
		int right = myString1.length()- 1;
		
		while(left<right) {
			
			String temp = Character.toString(myString1.charAt(left));
			
			myString1.replace(left, left+1, Character.toString(myString1.charAt(right)));
			myString1.replace(right, right+1, temp);
			
			left++;
			right--;
			
		}
		
		System.out.println("String after Reverse: ");
		System.out.println(myString1);
	}
}
