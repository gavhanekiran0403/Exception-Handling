package com.exzample.arithmetic;
// try with try catch
public class ArrayArithmetic {
	
	public void arithmeticOperation(int [] intArray) {
		
		try {
			for(int i=0;i<intArray.length;i++) {
				System.out.println(intArray[i]);
			}
			int[] b = intArray;
			try {
				for(int i=0;i<b.length;i++) {
					int div = b[i]/0;
					System.out.println(div);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		int [] intArray = {1,2,3,4,5,6};
		
		ArrayArithmetic arrayArithmetic = new ArrayArithmetic();
		arrayArithmetic.arithmeticOperation(intArray);
	}

}
