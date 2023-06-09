package com.example.write.csv.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteFile {
	
	public List<Student> studentRecord() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Roll No");
		int rollNo = sc.nextInt();
		
		System.out.println("Enter Student Name");
		String name = sc.next();
		
		Student student = new Student(rollNo, name);
		
		List<Student> list = new ArrayList<>();
		list.add(student);
		return list;
	}
	
	public void writeStudentRecord(List<Student> list,File file) {
		
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter(file,true);
			String heading = "Student RollNo, Student Name";
			try {
				if(file.length() == 0) {
					fileWriter.write(heading+"\n");
					for(Student s : list) {
						fileWriter.write(s.getRollNo()+","+s.getName()+"\n");
					}
					System.out.println("Student Record filled successfully..");
				}else {
					for(Student s : list) {
						fileWriter.write(s.getRollNo()+","+s.getName()+"\n");
					}
					System.out.println("Student Record filled successfully...");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void readStudentRecord(File file) {
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(file);
			try {
				int line;
				while((line=fileReader.read()) != -1) {
					System.out.print((char)line);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {

		String fileName = "StudentRecord.csv";
		File file = new File(fileName);
		
		WriteFile writeFile = new WriteFile();
		List<Student> list = writeFile.studentRecord();
		
		writeFile.writeStudentRecord(list,file);
		
		writeFile.readStudentRecord(file);
	}

}
