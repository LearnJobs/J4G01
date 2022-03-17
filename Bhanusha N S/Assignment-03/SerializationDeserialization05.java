package com.assignment3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDeserialization05 implements Serializable {
	int id;
	String bookname;
	String bookauthor;
	
	public SerializationDeserialization05(int id,String bookname,String bookauthor){
		this.id=id;
		this.bookname=bookname;
		this.bookauthor=bookauthor;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		
		//SERIALIZATION
		SerializationDeserialization05 sd=new SerializationDeserialization05(07,"Dr.RajKumar","Dr.Puneeth RajKumar ");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:/bhanusha"));
		oos.writeObject(sd);
		System.out.println("BOOK SERIALIZATION");
		
		//DESERIALIZATION
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/bhanusha"));
		SerializationDeserialization05 deserialzed =(SerializationDeserialization05)ois.readObject();
		System.out.println("BOOK DESERIALIZATION");
		System.out.println(deserialzed);
		
		
		
	}

}
