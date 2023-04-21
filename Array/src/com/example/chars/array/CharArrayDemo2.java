package com.example.chars.array;
//case 2 : array size declare extra in for loop 
public class CharArrayDemo2 {

	public void arrayShow() {
		
		char [] javaCharArray = new char[4];
		
		javaCharArray[0] = 'J';
		javaCharArray[1] = 'A';
		javaCharArray[2] = 'V';
		javaCharArray[3] = 'A';
		
		try {
			for(int i=0;i<5;i++) {       // extra size declare
				System.out.println(javaCharArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	
		CharArrayDemo2 charArrayDemo2 = new CharArrayDemo2();
		charArrayDemo2.arrayShow();

	}
}
