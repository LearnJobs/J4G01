package com.assignment04;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOfBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> bookList=new ArrayList<String>();
		bookList.add("Core Java");
		bookList.add("Spring Core");
		bookList.add("Java Script");
		
		Iterator<String> bookIterator=bookList.iterator();
		while(bookIterator.hasNext())
		{
			System.out.println(bookIterator.next());
		}
		
	}

}
