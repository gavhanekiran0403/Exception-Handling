package com.example.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		String fileName = "JavaClassNotes.txt";
		
		File file = new File(fileName);
		FileWriter write = null;
		
		try {
			
			if (file.exists()) {
				//file.createNewFile();
				System.out.println("File create : "+file);
			}else {
				System.out.println("file already created");
			}
			write = new FileWriter(file);
			
			try {
				
				String fileContent = "This is java class exception "+
								"handling with try catch & finally";
				write.write(fileContent);
			}catch(IOException e) {
				
				e.printStackTrace();
				
			}finally {
				
				write.close();
			}
			
		}catch(IOException e ) {
			
			e.printStackTrace();
		}
	}
}


