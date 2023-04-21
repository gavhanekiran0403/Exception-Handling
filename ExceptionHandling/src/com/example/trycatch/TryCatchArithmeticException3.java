package com.example.trycatch;
// wrapper class with null pointer exception
public class TryCatchArithmeticException3 {

	public void Add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition is : "+c);
	} 
	
	public void div() {
		Integer a = 12;
		Integer b = 0;
		
		try {
			a = null; // null value assign
			Integer c = a/b;
			System.out.println("Division is : "+c);
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(NullPointerException e) {
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
		
		TryCatchArithmeticException3 tryCatchArithmeticException3 = new TryCatchArithmeticException3();
		tryCatchArithmeticException3.Add();
		try {
			tryCatchArithmeticException3.div();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		tryCatchArithmeticException3.sub();

	}
}
