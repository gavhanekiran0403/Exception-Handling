package com.exzample.arithmetic;

public class CharArrayToString {
	
	public void convertCharArrayToNormalString(char[] charArray) {
		String str=null;
		if (charArray != null) {
			System.out.print("charArray is : ");
			for(char c : charArray) {
				System.out.print(c+" ");
			}
			
			char[] ch = charArray;
			str = new String(ch);
			System.out.println("\ncreate a new type of variable and store char array : "+str.toString());
			
			String s = new String(charArray);
			System.out.println("Normal String is : "+s);
			
			System.out.println("by using copyOfValue() : "+str.copyValueOf(charArray));
			
		}else {
			System.out.println("charArray it is a null : "+charArray);
		}
	}

	public static void main(String[] args) {
		
		char[] charArray = new char[10];

		charArray[0] = 'J';
		charArray[1] = 'A';
		charArray[2] = 'V';
		charArray[3] = 'A';
		charArray[4] = 'C';
		charArray[5] = 'L';
		charArray[6] = 'A';
		charArray[7] = 'S';
		charArray[8] = 'S';
		
		CharArrayToString charArrayToString = new CharArrayToString();
		
		charArrayToString.convertCharArrayToNormalString(charArray);
	}

}
