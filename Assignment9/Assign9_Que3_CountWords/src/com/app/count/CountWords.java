package com.app.count;

import java.util.StringTokenizer;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = "The class String includes methods for examining individual characters of the sequence, \r\n"
				+ "for comparing strings, for searching strings, for extracting substrings, and for creating a copy of a string \r\n"
				+ "with all characters translated to uppercase or to lowercase. Case mapping is based on the Unicode \r\n"
				+ "Standard version specified by the Character class";
		
		String [] arr = data.split(" ");
		StringTokenizer  stk = new StringTokenizer(data);
		System.out.println("NO of Words with array : " + arr.length);
		
		int count = stk.countTokens();
		System.out.println("NO of Words with Count : " + count);
	}

}
