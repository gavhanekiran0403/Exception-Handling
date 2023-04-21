package com.example.arrays;

import java.util.Arrays;

public class IntArrayToString {
	
	public void convertIntArrayToString(int[] num) {
		
		String [] stringArray = new String[num.length];
		
		for(int i=0;i<num.length;i++) {
			stringArray[i] = String.valueOf(num[i]);
		}
		
		String s= "";
		
		for(int i=0;i<stringArray.length;i++) {
			s= s.concat(stringArray[i]);
		}
		
		System.out.println("String is : "+s);
	}

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		
		IntArrayToString intArrayToString = new IntArrayToString();
		intArrayToString.convertIntArrayToString(num);

	}

}
