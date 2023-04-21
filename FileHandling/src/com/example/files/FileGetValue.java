package com.example.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileGetValue {
	
	public void getValue(File newFile) {
		
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(newFile));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				
				char [] charArray = line.toCharArray();
				
				int [] num = new int[charArray.length];
				
				for (int i=0; i<charArray.length;i++) {
					num[i] = charArray[i] - '0';
				}
				
				for (int i=0; i<num.length;i++) {
					System.out.print(num[i]+" ");
				}
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
		
		/*try {
			bufferedReader = new BufferedReader(new FileReader("new1.txt"));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				
				char [] charArray = line.toCharArray();
				
				int [] num = new int[charArray.length];
				
				for (int i=0; i<charArray.length;i++) {
					num[i] = charArray[i] - '0';
				}
				
				for (int i=0; i<num.length;i++) {
					System.out.print(num[i]+" ");
				}
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
		}*/
	}

	public static void main(String[] args) {
	
		FileGetValue fileGetValue = new FileGetValue();
		
		String newFileName = "newFile.txt";
		try {
			File newFile = new File(newFileName);
			fileGetValue.getValue(newFile);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
