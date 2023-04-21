package com.exzample.arithmetic;

import java.util.Arrays;

public class StringArrays {
	
	public void convertStringToArray(String string) {
		
		String s = string;
		try {
			int[] numArray = convertStringToIntArray(s);
			System.out.print("int Array is : ");
			for(int i = 0; i<numArray.length;i++) {
				System.out.print(numArray[i]+" ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		char[] charArray = new char[s.length()];
		
		try {
			for(int i=0;i<s.length();i++) {
				charArray[i] = s.charAt(i);
			}
			System.out.println("\nchar Array is : ");
			for(int i=0;i<charArray.length;i++) {
				System.out.println(charArray[i]);
			}
		}catch(NullPointerException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	private int[] convertStringToIntArray(String s) {
		
		char[] ch = s.toCharArray();
		
		int[] num = new int [ch.length];
		
		for(int i=0;i<ch.length;i++) {
			num[i] = ch[i]-'0';
		}
		
		return num;
	}

	public static void main(String[] args) {
		String s = "1236147849155151551";
		
		StringArrays stringArrays = new StringArrays();
		
		if(s != null){
			stringArrays.convertStringToArray(s);
		}
	}

}
