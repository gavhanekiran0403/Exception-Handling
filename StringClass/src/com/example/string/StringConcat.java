package com.example.string;

public class StringConcat {

	public static void main(String[] args) {
	
		String name = "Java class";
		//String concat with + operator in sysout but not valid 
		System.out.println("by using + operator : "+name+" Core java");
		
		System.out.println("**********************");
		
		//String concat by using concat()
		/*This statement proves that we are not going to add any extra value with original
		 * string initialized value and this statement proves that string is immutable object*/
		name.concat("Core java");
		System.out.println(name);
		
		System.out.println("**********************");
		
		name = name.concat(" Core java");
		System.out.println(name);
		
		System.out.println("**********************"); 
		
		String string = new String("OCJP Exam");
		string.concat("10-jan-2023");
		System.out.println(string);
		
		System.out.println("**********************");
		
		string = string.concat(" 10-jan-2023");
		System.out.println(string);
		
		
	}

}
