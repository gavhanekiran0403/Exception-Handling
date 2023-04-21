package com.example.chars.array;
// case 1 : array size declare less 
public class CharArrayDemo1 {
	
	public void arrayShow() {
		
		char [] javaCharArray = new char[3]; // less size declare
		
		javaCharArray[0] = 'J';
		javaCharArray[1] = 'A';
		javaCharArray[2] = 'V';
		javaCharArray[3] = 'A';
		
		try {
			for(int i=0;i<javaCharArray.length;i++) {
				System.out.println(javaCharArray[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	
		CharArrayDemo1 charArrayDemo1 = new CharArrayDemo1();
		charArrayDemo1.arrayShow();

	}
}
