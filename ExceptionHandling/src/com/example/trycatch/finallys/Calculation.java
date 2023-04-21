package com.example.trycatch.finallys;
// case 1 : try catch with finally block
public class Calculation extends MathOperation {
	
	public void div(int x, int y) {
		
		try {
			int z = x/y;
			System.out.println("Division of  x and y is : "+z);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Any no. is not able to divided by zero");
		}
		
	}

	public static void main(String[] args) {
		
		Calculation calculation = new Calculation();
		calculation.add(10, 20);
		try {
			calculation.div(10, 0);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	

}
