package com.example.write.read.file;

import java.io.*;

public class FileWriterDemo {
	Student student;
	public void createFile(File file) {
		
		FileWriter fileWriter = null;
		try {
			file.createNewFile();
			fileWriter = new FileWriter(file);
			try {
				student = new Student("kiran",101);
				System.out.println(student.getName()+" "+student.getRollNo());
				fileWriter.write("Student name : "+student.getName()+"\n");
				fileWriter.write("Student roll No. : "+student.getRollNo());
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
		
		String fileName = "String.txt";
		File file = new File(fileName);
		FileWriterDemo fileWriterDemo = new FileWriterDemo();
		fileWriterDemo.createFile(file);
	}
}
