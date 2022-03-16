package com.assignments02;
//program 04 main method
public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookEquality books = new BookEquality(001,"Maths", "Arya Bhatt");
		BookEquality books1 = new BookEquality(001,"Maths", "Bhatt");
		if(books.equals(books1))
			System.out.println("Books are equal");
		else
			System.out.println("Books are not equal");


	}

}
