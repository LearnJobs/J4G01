package com.assignment04;

import java.util.HashSet;

public class BookCollection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 b1=new Book1(1,"Core Java");
		Book1 b2=new Book1(2,"Spring Core");
		Book1 b3=new Book1(3,"JavaScript");
		Book1 b4=new Book1(1,"Core Java");		
		
		HashSet<Book1> nameSet=new HashSet<Book1>();
		nameSet.add(b1);
		nameSet.add(b2);
		nameSet.add(b3);
		nameSet.add(b4);
		
		
		//System.out.println(nameSet);
		
		for(Book1 b:nameSet)
		{
			System.out.println(b);
		}
		
		
		
		
		
		

	}

}
