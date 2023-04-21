package com.example.trycatch.finallys;
/*case 4 : throws declare child class exception (e.g. ArithmeticException) and 
 * throw declare parent class exception (e.g. Exception) to give compile time error*/
public class Calculation3 extends MathOperation3 {

	public void div(int x, int y) {
		
		try {
			int z = x/y;
			System.out.println("Division of  x and y is : "+z);
			//throw new Exception(); // not valid statement parent class not allow to throw 
		}finally {
			System.out.println("Any no. is not able to divided by zero");
		}
		
	}

	public static void main(String[] args) {
		
		Calculation3 calculation3 = new Calculation3();
		calculation3.add(10, 20);
		try {
			calculation3.div(10, 0);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
