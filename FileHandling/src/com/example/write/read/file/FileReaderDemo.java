package com.example.write.read.file;

import java.io.*;

public class FileReaderDemo {
	
	public void readFile(File file) {
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(file);
			int  i;
			try {
				while((i = fileReader.read()) != -1) {
					System.out.print((char)i);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		File file = new File("E:\\Eclipse Exception Handling\\FileHandling\\String.txt");
		
		FileReaderDemo fileReaderDemo = new FileReaderDemo();
		fileReaderDemo.readFile(file);
	}

}
