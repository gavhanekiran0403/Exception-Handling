package com.example.write.read.file;

public class Student {
	
	private String name;
	private int rollNo;
	
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
}
