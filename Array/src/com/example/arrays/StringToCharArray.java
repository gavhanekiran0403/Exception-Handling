package com.example.arrays;

public class StringToCharArray {
	
	public void convertStringToCharArray(String string) {
		
		// 1st way
		char[] charArray = new char[string.length()];
		
		try {
			
			for(int i=0;i<string.length();i++) {
				charArray[i] = string.charAt(i);
			}
			
			System.out.print("charArray is : ");
			for(int i=0;i<charArray.length;i++) {
				System.out.print(charArray[i]+" ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 2nd way 
		char[] chArray = string.toCharArray();
		
		try {
			System.out.print("\ncharArray is : ");
			for(int i=0;i<chArray.length;i++) {
				System.out.print(chArray[i]+" ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		String string = "123456789";
		
		StringToCharArray stringToCharArray = new StringToCharArray();
		stringToCharArray.convertStringToCharArray(string);
	}

}
