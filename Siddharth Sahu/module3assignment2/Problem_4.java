//Write a program to add and print the Book object in HashSet.

package com.module3assignment2;

import java.util.HashSet;
import java.util.Iterator;

public class Problem_4 {

	public static void main(String[] args) {

		Book4 b1 = new Book4("Java", 500);
		Book4 b2 = new Book4("Python", 400);
		Book4 b3 = new Book4("C#", 700);
		Book4 b4 = new Book4("HTML", 350);
		Book4 b5 = new Book4("C#", 700);

		HashSet<Book4> bookSet = new HashSet<Book4>();
		bookSet.add(b1);bookSet.add(b2);bookSet.add(b3);bookSet.add(b4);bookSet.add(b5);
		
		Book4 b6 = new Book4("Ruby", 650);
		bookSet.add(b6);

		Iterator<Book4> bookIterator = bookSet.iterator();
		while (bookIterator.hasNext()) {
			System.out.println(bookIterator.next());
		}
	}

}
