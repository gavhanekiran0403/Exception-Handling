package com.example.files;

import java.io.*;
import java.util.*;

public class ConvertStringToIntArray {
	 	
	 public void readFile(File file) {
	 		
	 BufferedReader bufferedReader = null;
	 		
	 String intString = "";
	 	try {
	 		bufferedReader = new BufferedReader(new FileReader(file));
	 		String str;
	 		try { 
	 			while((str = bufferedReader.readLine())  != null)
	 			
	 			for(int i = 0;i<str.length();i++) {
	 				char c = str.charAt(i);
	 				if('0' <= c && c <= '9')
	 				intString = intString+c;
	 			}
	 			System.out.println("IntString is : "+intString);
	 			char [] charArray = intString.toCharArray();
	 				
	 			int [] num = new int[charArray.length];
	 			System.out.print("int [] is : ");
	 			
	 			for (int i=0; i<charArray.length;i++) {
	 					
	 				System.out.print(num[i] = charArray[i] - '0');
	 				System.out.print(", ");
	 			}
	 				
	 			List<Integer> integerList = new ArrayList<Integer>(num.length);
	 				
	 			for(Integer integer : num) {
	 				integerList.add(integer);
	 			}
	 				
	 			System.out.println("\nsize of integerList : "+integerList.size());
	 				
	 			System.out.println("value of integerList : "+integerList);
	 				
	 			}catch(IOException e) {
	 				e.printStackTrace();
	 			}
	 			
	 		}catch(Exception e) {
	 			e.printStackTrace();
	 		}
	 	
	 	}

	 	public static void main(String[] args) {
	 		
	 		ConvertStringToIntArray convertStringToIntArray = new ConvertStringToIntArray();
	 		String fileName = "new.txt";
	 		File file = new File(fileName);
	 		convertStringToIntArray.readFile(file);
	 	}

}
