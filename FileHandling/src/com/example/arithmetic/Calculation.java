package com.example.arithmetic;

import java.io.*;
// Exception write on file 
public class Calculation extends MathOperation {
	
	public void div(int x, int y) {
		
		String fileName = "Math.txt";
		File file = new File(fileName);
		FileWriter fileWriter = null;
		
		try {
			file.createNewFile();
			fileWriter = new FileWriter(file);
			fileWriter.write("Division is : "+c+"\n");
			try {
				int z = x/y;
				fileWriter.write("Division is : "+z);
			}catch(ArithmeticException e) {
				e.printStackTrace();
				fileWriter.write(e.toString());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		
		Calculation calculation = new Calculation();
		calculation.add(10, 20);
		calculation.div(10, 0);
	}

}
