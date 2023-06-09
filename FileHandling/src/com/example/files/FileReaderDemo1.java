package com.example.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {
	
	public void readFile(File file) {
		
		FileReader fileReader = null;
		
		try {
			int i;
			fileReader = new FileReader(file);
			char c = 0;
			try {
				System.out.println("Printing data : "+file);
				while((i = fileReader.read()) != -1) {
					c=((char)i);
					System.out.print(c);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		FileReaderDemo1 fileReaderDemo1 = new FileReaderDemo1();

		String fileName = "FileData.txt";
		try {
			File file = new File(fileName);
			fileReaderDemo1.readFile(file);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
