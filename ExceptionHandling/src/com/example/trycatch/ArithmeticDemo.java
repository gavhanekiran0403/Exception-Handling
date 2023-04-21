package com.example.trycatch;
// Exception occurs 
public class ArithmeticDemo {
	
	public void Add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition is : "+c);
	} 
	
	public void div() {
		int a = 12;
		int b = 0;
		int c = a/b;
		System.out.println("Division is : "+c);
	}
	
	public void sub() {
		int a = 20;
		int b = 10;
		int c = a-b;
		System.out.println("Substraction is : "+c);
	}

	public static void main(String[] args) {
		
		ArithmeticDemo arithmeticDemo = new ArithmeticDemo();
		arithmeticDemo.Add();
		arithmeticDemo.div();
		arithmeticDemo.sub();
		
	}

}
