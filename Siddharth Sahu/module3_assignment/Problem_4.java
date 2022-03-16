package com.module3_assignment;
//Write a program to read from a file and write its content to the other file.


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem_4 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\siddh\\Documents\\java\\Week1\\Module 3 assignment\\src\\input.txt");
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter("C:\\Users\\siddh\\Documents\\java\\Week1\\Module 3 assignment\\src\\output.txt");
		
		//BufferedReader br = new BufferedReader(fr);
		String data = null;
		int i;
		
		while((i = fr.read())!= -1)
		{
			//System.out.print((char)fr.read());
			data +=(char)i;
		}
		fw.write(data);
		
		fr.close();
		fw.close();
		
		System.out.println("Reading and writing completed");
		
		
//		File f1 = new File("C:\\Users\\siddh\\Documents\\java\\Week1\\Module 3 assignment\\src\\output.txt");
//		FileReader fr1 = new FileReader(f);
//		
//		BufferedReader br = new BufferedReader(fr1);
//		String data1 ;
//	
//		
//		while((data1 = br.readLine())!= null)
//		{
//			System.out.println(data1);
//		}
	}

}
