package com.example.arrays;

import java.util.*;

public class IntArrayToStringArray {
	
	public void convertIntArrayToStringArray(int[] num) {
		
		String [] stringArray = new String[num.length];
		
		for(int i=0;i<num.length;i++) {
			stringArray[i] = String.valueOf(num[i]);
		}
		
		System.out.print("String[] is : ");
		for(int i=0;i<stringArray.length;i++) {
			System.out.print(stringArray[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9};

		IntArrayToStringArray intArrayToStringArray = new IntArrayToStringArray();
		intArrayToStringArray.convertIntArrayToStringArray(num);
	}

}
