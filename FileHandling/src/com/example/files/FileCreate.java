package com.example.files;

import java.io.*;

public class FileCreate {
	
	public void createFile(File file) {
		
		String fileContent = "12A34B56C78D9E10F11G12H12I14J15K16L17M18N19 "+file;
		
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		
		String intString = "";
		String string =  "";
		
		try {
			file.createNewFile();
			try {
				fileWriter = new FileWriter(file);
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
		
		try {
			fileReader = new FileReader(file);
			int i;
			try {
				while((i = fileReader.read()) != -1) {
					System.out.print((char)i+", ");
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		/******Print file data using FileOutputStream*****/
		
		try {
			fileInputStream = new FileInputStream(file);
			String outputStram = null;
			try {
				byte[] bytes = new byte[7000];
				while(fileInputStream.read(bytes) != -1) 
					outputStram = new String(bytes);
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			/***** Separating int and char from String *****/
			
			System.out.println("\nString is : "+outputStram);
			System.out.println("Separating int value and String value from combined String "+"\n"+"String value : "+fileContent);
			
			String a = outputStram;
			int i;
			
			for(i=0;i<a.length();i++) {
				char c = a.charAt(i);
				
				if('0'<=c && c<= '9') 
					intString = intString+c;
				if('A'<=c && c<= 'Z')
					string = string+c;
				if('a'<=c && c<= 'z')
					string = string+c;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("int String is : "+intString);
		System.out.println("char String is : "+string);
		
		/****** Writing data in file using FileOutputStream *****/
		
		try {
			fileOutputStream = new FileOutputStream("New.txt");
			try {
				fileOutputStream.write(intString.getBytes());
				fileOutputStream.write(string.getBytes());
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
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readWriteFile(File file) {
		
	/****** Writing and read data in file using BufferedReader & BufferedWriter *****/
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(file));
			bufferedWriter = new BufferedWriter(new FileWriter("NewData.txt"));
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println("Read by using BufferedReader : "+line);
				if(line.contains("Datatxt"))
					System.out.println("By using contains() : "+line);
				line = line.replace("Data.txt", "this is new line added");
				bufferedWriter.write(line+"\n");
				bufferedWriter.write("New line added after replacing above line content");	
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bufferedReader != null)
				bufferedReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if(bufferedWriter != null)
				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		FileCreate fileCreate = new FileCreate();
		
		String fileName = "Data.txt";
		File file = new File(fileName);
		try {
			fileCreate.createFile(file);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		String newFileName = "New.txt";
		File newFile = new File(newFileName);
		try {
			fileCreate.readWriteFile(newFile);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
