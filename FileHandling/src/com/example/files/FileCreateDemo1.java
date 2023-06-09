package com.example.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo1 {
	
	public void createFile(File file) {
		
		String fileContent = "12 A 34 B 56 C 78 D 9 E 10 F 11 G 12 H 13 I 14 J 15 K 16 L 17 M 18 N 19 O 20 P "+ file;
		
		FileWriter fileWriter = null;
		
		try {
			file.createNewFile();
			try {
				fileWriter = new FileWriter(file);
				System.out.println("String is : "+fileContent);
				fileWriter.write(fileContent);
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fileWriter.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		FileCreateDemo1 fileCreateDemo1 = new FileCreateDemo1();
		String fileName = "FileData.txt";
		try {
			File file = new File(fileName);
			fileCreateDemo1.createFile(file);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
