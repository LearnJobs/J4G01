//Write a program to use Comparable interface.

package com.module3assignment2;

import java.util.TreeSet;

public class Problem_5 {


	public static void main(String[] args) {

		Book5 b1 = new Book5("Java", 500);
		Book5 b2 = new Book5("Python", 400);
		Book5 b3 = new Book5("C#", 700);
		Book5 b4 = new Book5("HTML", 350);

		TreeSet<Book5> bookSet = new TreeSet<Book5>();
		bookSet.add(b1);bookSet.add(b2);bookSet.add(b3);bookSet.add(b4);
		
		for(Book5 b:bookSet) 
			System.out.println(b);
		}
	}

