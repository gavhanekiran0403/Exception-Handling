package com.example.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriterDemo1 {
	
	public void readFile(File file) {
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			bufferedWriter  = new BufferedWriter(new FileWriter("newFileData1.txt"));
			
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				
				System.out.println("inside readWriteFile :"+line);
				line = line.replace(line, " "+"1234567891011121314151617181920");
				
				System.out.println("String after replace : "+line);
				bufferedWriter.write(line);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bufferedWriter !=null)
					bufferedWriter.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		FileBufferedWriterDemo1  fileBufferedWriterDemo1 = new FileBufferedWriterDemo1();
		String newFileName = "new.txt";
		try {
			File newFile = new File(newFileName);
			fileBufferedWriterDemo1.readFile(newFile);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
