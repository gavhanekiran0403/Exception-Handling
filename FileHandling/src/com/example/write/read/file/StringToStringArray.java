package com.example.write.read.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StringToStringArray {

	public String[] convertStringToStringArray(String string) {
		
		String[] str = string.split("");
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		return str;
	}
	
	public void writeFile(String[] str,File file) {
		
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
			try {
				for(int i=0;i<str.length;i++) {
					fileWriter.write(str[i]);
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
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		String string = "ABCDEFGHIJK";
		
		String fileName = "StringArray.txt";
		File file = new File(fileName);

		StringToStringArray stringToStringArray = new StringToStringArray();
		String[] str = stringToStringArray.convertStringToStringArray(string);
		
		stringToStringArray.writeFile(str,file);
	}

}
