package com.assignment01;

public class BookParameterized {

	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	int bookid;
	String bookName;
	String bookAuthor;

	public BookParameterized(int bookid, String bookName, String bookAuthor) {
		// super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	void printBook() {
		System.out.println("bookid is : " + bookid);
		System.out.println("bookName is : " + bookName);
		System.out.println("bookAuthor is : " + bookAuthor);
	}

	public static void main(String[] args) {

		BookParameterized book = new BookParameterized(101, "Prince of Persia", "Shylock");
		book.printBook();
	}

}
