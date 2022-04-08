package com.library.beans;

public class Book {
	private String callNo,bookName,bookAuthor,bookPublisher;
	private int bookQuantity,bookIssued;
	
	public Book() {
		super();
	}

	public Book(String callNo, String bookName, String bookAuthor, String bookPublisher, int bookQuantity,
			int bookIssued) {
		super();
		this.callNo = callNo;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookQuantity = bookQuantity;
		this.bookIssued = bookIssued;
	}

	public String getCallNo() {
		return callNo;
	}

	public void setCallNo(String callNo) {
		this.callNo = callNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public int getBookQuantity() {
		return bookQuantity;
	}

	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}

	public int getBookIssued() {
		return bookIssued;
	}

	public void setBookIssued(int bookIssued) {
		this.bookIssued = bookIssued;
	}
	
	
}
