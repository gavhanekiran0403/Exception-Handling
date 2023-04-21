package com.example.chars.array;
//case 5 : by using for each loop with null check
public class CharArrayDemo5 {

	public void arrayShow() {
		
//		char [] javaCharArray = new char[4];
		
//		javaCharArray[0] = 'J';
//		javaCharArray[1] = 'A';
//		javaCharArray[2] = 'V';
//		javaCharArray[3] = 'A';
		
		char [] javaCharArray = null;
		
		try {
			if (javaCharArray != null) {
				for(char c : javaCharArray) {      
					System.out.println(c);
				}
			}else {
				System.out.println(javaCharArray);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	
		CharArrayDemo5 charArrayDemo5 = new CharArrayDemo5();
		charArrayDemo5.arrayShow();

	}
}
