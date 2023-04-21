package com.example.trycatch.finallys;
// case 4 : throws multiple Exception
public class Calculation4 extends MathOperation4{

	public void div(int x, int y) {
		
		try {
			int z = x/y;
			System.out.println("Division of  x and y is : "+z);
			throw new ArithmeticException(); 
		}finally {
			System.out.println("Any no. is not able to divided by zero");
		}
		
	}

	public static void main(String[] args) {
		
		Calculation4 calculation4 = new Calculation4();
		calculation4.add(10, 20);
		try {
			calculation4.div(10, 0);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
