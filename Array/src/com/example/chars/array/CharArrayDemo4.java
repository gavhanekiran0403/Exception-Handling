package com.example.chars.array;
//case 4 : by using for each loop without null check
public class CharArrayDemo4 {

	public void arrayShow() {
		
		char [] javaCharArray = new char[4];
		
		javaCharArray[0] = 'J';
		javaCharArray[1] = 'A';
		javaCharArray[2] = 'V';
		javaCharArray[3] = 'A';
		
		try {
			for(char c : javaCharArray) {      
				System.out.println(c);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	
		CharArrayDemo4 charArrayDemo4 = new CharArrayDemo4();
		charArrayDemo4.arrayShow();

	}
}
