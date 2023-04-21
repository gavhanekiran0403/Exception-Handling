package com.example.arrays;

public class CharArrayToString {
	
	public void convertCharArrayToString(char[] charArray) {
		
		String string = new String(charArray);
		System.out.println("String is : "+string);
		
		String s = new String();
		System.out.println("String by using copyValueOf() : "+s.copyValueOf(charArray));
	}

	public static void main(String[] args) {
		
		char[] charArray = {'K','I','R','A','N'};

		CharArrayToString charArrayToString = new CharArrayToString();
		charArrayToString.convertCharArrayToString(charArray);
	}

}
