package com.example.arrays;

public class CharArrayToIntArray {
	
	public void convertCharArrayToIntArray(char[] charArray) {
		 
		int[] num = new int[charArray.length];
		
		for(int i=0;i<charArray.length;i++) {
			num[i] = charArray[i]-'0';
		}
		
		System.out.print("int[] is : ");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.print("\nint[] is(by using for each loop) : ");
		for(int n : num) {
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		
		char[] charArray = {'1','2','3','4','5','6','7'};
		
		CharArrayToIntArray charArrayToIntArray = new CharArrayToIntArray();
		charArrayToIntArray.convertCharArrayToIntArray(charArray);
		
	}

}
