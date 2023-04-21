package com.example.trycatch;

public class TryCatchArithmeticException5 {

	public void display(String a, String b) {
		
		try {
			String  c = a.concat(b);
			System.out.println(c);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String args []) {
		TryCatchArithmeticException5 TryCatchArithmeticException5 = new TryCatchArithmeticException5();
		TryCatchArithmeticException5.display("kiran",null);
	} 
}
