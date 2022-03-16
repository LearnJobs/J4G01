package com.module1Assignmnet;

public class Book1 {
	
	int bookId;
	String bookName,bookAuthor;
	
	public Book1() {
		 bookId = 01;
		 bookName = "Java";
		 bookAuthor = "GFG";	
	}

	public void printBook() {
		System.out.println("book_Id is "+bookId+" book_Name is "+bookName+" book_Author is"+bookAuthor);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book1 book1Name = new Book1();
		book1Name.printBook();
		

	}

}

