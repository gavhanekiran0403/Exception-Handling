package com.example.trycatch;
// try catch
public class TryCatchArithmeticException1 {

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
		
		TryCatchArithmeticException1 tryCatchArithmeticException1 = new TryCatchArithmeticException1();
		tryCatchArithmeticException1.Add();
		try {
			tryCatchArithmeticException1.div();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		tryCatchArithmeticException1.sub();

	}

}
