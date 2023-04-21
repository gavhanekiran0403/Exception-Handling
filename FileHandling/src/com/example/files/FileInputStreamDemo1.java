package com.example.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
	
	
	public void readFile(File file) {
		
		FileInputStream fileInputStream = null;
		
		
		try {
			fileInputStream = new FileInputStream(file);
			String outputString = null;
			try {
				byte [] bytes = new byte[2000];
				while(fileInputStream.read(bytes) != -1)
					outputString = new String(bytes);
				System.out.println("String is(Store in byte[]) : "+outputString);
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		FileInputStreamDemo1 fileInputStreamDemo1 = new FileInputStreamDemo1();

		String fileName = "FileData.txt";
		try {
			File file = new File(fileName);
			fileInputStreamDemo1.readFile(file);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
