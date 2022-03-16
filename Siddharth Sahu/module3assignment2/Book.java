package com.module3assignment2;

public class Book {
	String bookName;
	int bookPrice;

	public Book(String bookName, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book = " + bookName + ", bookPrice = " + bookPrice;
	}

}
