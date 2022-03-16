// Write a program to create and print ArrayList of Books(use Iterator)

package com.module3assignment2;

import java.util.ArrayList;
import java.util.Iterator;

public class Problem_1 {

	public static void main(String[] args) {
		
		Book b1 = new Book("Java",500);
		Book b2 = new Book("Python",400);
		Book b3 = new Book("C#",700);
		Book b4 = new Book("HTML",350);
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	bookList.add(b1);bookList.add(b2);bookList.add(b3);bookList.add(b4);
	
	
	Iterator<Book> bookIterator = bookList.iterator();
	while(bookIterator.hasNext()) {
		System.out.println(bookIterator.next());
	}
}
}