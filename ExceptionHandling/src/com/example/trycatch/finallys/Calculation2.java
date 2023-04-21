package com.example.trycatch.finallys;
// case 2 : try with finally block (finally block execute w/o catch block)
public class Calculation2 extends MathOperation {

	public void div(int x, int y) {
		
		try {
			int z = x/y;
			System.out.println("Division of  x and y is : "+z);
		}finally {
			System.out.println("Any no. is not able to divided by zero");
		}
		
	}

	public static void main(String[] args) {
		
		Calculation2 calculation2 = new Calculation2();
		calculation2.add(10, 20);
		try {
			calculation2.div(10, 0);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
