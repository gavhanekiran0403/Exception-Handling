package com.example.arrays;

public class StringToStringArray {
	
	public void convertStringToStringArray(String string) {
		
		String[] str = string.split(" ");
		
		System.out.println("String[] is : ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

	public static void main(String[] args) {
		
		String string = "Kiran Tushar Bhushan Hitesh Piyush Prshant";
		
		StringToStringArray stringToStringArray = new StringToStringArray();
		stringToStringArray.convertStringToStringArray(string);
	}

}
