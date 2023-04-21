package com.example.chars.array;
//case 3 : extra variable declaration
public class CharArrayDemo3 {

	public void arrayShow() {
		
		char [] javaCharArray = new char[4];
		
		javaCharArray[0] = 'J';
		javaCharArray[1] = 'A';
		javaCharArray[2] = 'V';
		javaCharArray[3] = 'A';
		javaCharArray[4] = 'C';    // extra variable declare
		
		try {
			for(int i=0;i<javaCharArray.length;i++) {      
				System.out.println(javaCharArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	
		CharArrayDemo3 charArrayDemo3 = new CharArrayDemo3();
		charArrayDemo3.arrayShow();

	}
}
