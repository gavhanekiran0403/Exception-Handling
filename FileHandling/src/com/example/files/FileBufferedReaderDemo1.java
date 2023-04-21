package com.example.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferedReaderDemo1 {

	public void readFile(File file) {
		
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bufferedReader !=null)
					bufferedReader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		}
		
	}
	public static void main(String[] args) {
		
		FileBufferedReaderDemo1 fileBufferedReaderDemo1 = new FileBufferedReaderDemo1();

		String newFileName = "newFileData.txt";
		try {
			File newFile = new File(newFileName);
			fileBufferedReaderDemo1.readFile(newFile);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
