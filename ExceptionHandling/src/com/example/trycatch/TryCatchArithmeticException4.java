package com.example.trycatch;

public class TryCatchArithmeticException4 {

	public void Add(int a,int b) {
		int c = a+b;
		System.out.println("Addition is : "+c);
	} 
	
	public void div(Integer a, Integer b) {
		if (a!=null && b!=null) {
			try {
				Integer c = a/b;
				System.out.println("Division is : "+c);
			}catch(ArithmeticException e) {
				e.printStackTrace();
			}catch(NullPointerException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Division is :: value of a : "+a+" value of b : "+b);
		}
	}
	
	public void sub(int a,int b) {
		int c = a-b;
		System.out.println("Substraction is : "+c);
	}

	public static void main(String[] args) {
		
		TryCatchArithmeticException4 tryCatchArithmeticException4 = new TryCatchArithmeticException4();
		tryCatchArithmeticException4.Add(10,20);
		try {
			tryCatchArithmeticException4.div(12,0);
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		tryCatchArithmeticException4.sub(20,10);
	
	}
	
}
