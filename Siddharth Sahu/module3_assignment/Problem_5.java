package com.module3_assignment;
//Write a program to serialize and deserialize Book object.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Problem_5 implements Serializable{

	int bookPrice;
	String bookName;
	
	public Problem_5(String bookName,int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public String toString() {
		return bookName+" , "+bookPrice;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Problem_5 problem5 = new Problem_5("java",504);
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("C:\\Users\\siddh\\Documents\\java\\Week1\\Module 3 assignment\\src\\input.dat");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		os.writeObject(problem5);
		os.close();
		
		System.out.println("Object is serialzied");
		
		//Deserialization
		FileInputStream fis = new FileInputStream("C:\\Users\\siddh\\Documents\\java\\Week1\\Module 3 assignment\\src\\input.dat");
		ObjectInputStream is = new ObjectInputStream(fis);
		
		Problem_5 problem51 = (Problem_5)is.readObject();
		System.out.println("Object is deserialized "+problem51);

		
	}

}
