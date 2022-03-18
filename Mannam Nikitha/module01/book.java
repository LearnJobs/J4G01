package com.assignment01;

  public class Book {
	int bookId;
	String bookName,bookAuthor;
	
	public Book() {		//Default constructor
		bookId=2222;
		bookName="Harry Potter";/Users/rohinikumar/eclipse-workspace/gavs /module1/src/com/assignment01/book.java
		bookAuthor="J. K. Rowlling";
	}
	public Book(int bookId, String bookName, String bookAuthor) {
		 super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	public void printBook()
	{
		System.out.println("Book Id : "+bookId+"\nBook Name : "+bookName+"\nAuthor : "+bookAuthor+"\n");
	}

}