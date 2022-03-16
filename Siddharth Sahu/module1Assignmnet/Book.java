package com.module1Assignmnet;

public class Book {

	public int bookPrice;
	public String bookName,bookAuthor;
	
	public Book(String bookName,String bookAuthor,int bookPrice){
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	
	public void displayBook() {
		System.out.println(bookName +" "+bookAuthor+" "+bookPrice);
	}
	
	
}
