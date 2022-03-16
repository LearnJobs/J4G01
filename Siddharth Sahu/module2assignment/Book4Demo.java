package com.module2assignment;

public class Book4Demo {
	
	public static void main(String[] args) {

		Book4 book1 = new Book4("Java",360);
		Book4 book2 = new Book4("Java",360);
		Book4 book3 = new Book4("Python",350);
		
		//book1.ObjEqual(book1, book1);
		System.out.println(book1.equals(book3));;
	}
	
}

