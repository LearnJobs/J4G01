package com.module1Assignmnet;

public class Book2 {
	
	int bookId;
	String bookName,bookAuthor;
	
	public Book2(int bookId,String bookName,String bookAuthor) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;	
	}

	public void printBook() {
		System.out.println("book_Id is "+bookId+" book_Name is "+bookName+" book_Author is "+bookAuthor);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book2 book1Name = new Book2(101,"Java","Gfg");
		book1Name.printBook();
		

	}

}
