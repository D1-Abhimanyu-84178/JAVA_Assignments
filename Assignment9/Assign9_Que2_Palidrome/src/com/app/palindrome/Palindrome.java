package com.app.palindrome;

public class Palindrome {
public static void main(String[] args) {
	
	StringBuffer myString1 = new StringBuffer("psisn");
	
	int left = 0;
	int right = myString1.length()-1;
    int count = 0;
	while(left<=right) {
		if(myString1.charAt(left) ==  myString1.charAt(right)) {
			count ++;
		}
		left++;
		right--;
	}
	if(myString1.length()%2 == 0) {
		
		if(count == myString1.length()/2) {
			System.out.println("Yes Given String is Palindrome");
		}
	}
	else if (count == ((myString1.length()/2)+1)) {
		System.out.println("Yes Given String is Palindrome");
	}
	
	else {
		System.out.println("given string is not palindrome");
	}
}
}
