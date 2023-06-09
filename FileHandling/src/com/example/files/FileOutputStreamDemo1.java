package com.example.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
	
	public void readFile(File file) {
		
		String fileContent = "12 A 34 B 56 C 78 D 9 E 10 F 11 G 12 H 13 I 14 J 15 K 16 L 17 M 18 N 19 O 20 P ";
		
		String intString = "";
		String string = "";
		
		//Separating Int & char from String
		byte [] outputString = fileContent.getBytes();
		String s = new String(outputString);
		String str = s;
		try {
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if('0' <= c && c <= '9')
				intString = intString+c;
			if('A' <=c && c <= 'Z')
				string = string+c;
			if('a' <=c && c <= 'z')
				string = string+c;
		}
		
		
			System.out.println("int value : "+intString);
			System.out.println("char value : "+string);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		FileOutputStream fileOutputStream = null;
		
		try {
			fileOutputStream = new FileOutputStream("newFileData.txt");
			try {
				fileOutputStream.write(intString.getBytes());
				fileOutputStream.write(string.getBytes());
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileOutputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			try {
				fileOutputStream.flush();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		FileOutputStreamDemo1 fileOutputStreamDemo1 = new FileOutputStreamDemo1();
		
		String fileName = "FileData.txt";
		try {
			File file = new File(fileName);
			fileOutputStreamDemo1.readFile(file);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
