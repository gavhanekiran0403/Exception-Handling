package com.example.string;

public class StringDemo {

	public static void main(String[] args) {
		
		// String declare by String object
		String string = new String();
		string = "Java class";
		System.out.println("Value of string is : "+string);
		
		// String declare by String literal
		String name = "Java";
		System.out.println("Value of string is : "+name);
		
		string = name;
		System.out.println("String is : "+string);
		
		name = string;
		System.out.println("String is : "+name);
	}
}
