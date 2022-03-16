package com.module3assignment2;

public class Book3 {

	String bookName,bookAuthor;
	int bookPrice,id;
	
	public Book3( int id,String bookName, String bookAuthor, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.id = id;
	}

	@Override
	public String toString() {
		return "id = " + id + ", bookName = " + bookName + ", bookAuthor = " + bookAuthor + ", bookPrice = " + bookPrice + ", id = " + id;
	}
	
}
