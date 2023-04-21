package com.example.trycatch.finallys;

public abstract class MathOperation {

	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Addition of a and b is : "+c);
	}
	
	public abstract void div(int x, int y) throws Exception; 
}
