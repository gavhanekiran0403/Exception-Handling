package com.example.arrays;

public class StringToIntArray {
	
	public void convertStringToIntArray(String string) {
		
		char[] ch = string.toCharArray();
		
		int[] num = new int[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			num[i] = ch[i]-'0';
		}
		
		System.out.print("intArray is : ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]);
		}
	}

	public static void main(String[] args) {
	
		String string = "123456789";
		
		StringToIntArray stringToIntArray = new StringToIntArray();
		stringToIntArray.convertStringToIntArray(string);
	}

}
