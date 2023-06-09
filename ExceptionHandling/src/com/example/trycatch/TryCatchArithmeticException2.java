package com.example.trycatch;
//try with multiple catch
public class TryCatchArithmeticException2 {

	public void Add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition is : "+c);
	} 
	
	public void div() {
		int a = 12;
		int b = 0;
		
		try {
			int c = a/b;
			System.out.println("Division is : "+c);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sub() {
		int a = 20;
		int b = 10;
		int c = a-b;
		System.out.println("Substraction is : "+c);
	}

	public static void main(String[] args) {
		
		TryCatchArithmeticException2 tryCatchArithmeticException2 = new TryCatchArithmeticException2();
		tryCatchArithmeticException2.Add();
		try {
			tryCatchArithmeticException2.div();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		tryCatchArithmeticException2.sub();

	}
}
