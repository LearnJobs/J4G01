package com.assignments02;

/**
 * 04.equality of book object
 * 
 */
public class BookEquality {
	int bookid;
	String bookname;
	String bookauthor;

	public BookEquality(int bookid, String bookname, String bookauthor) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;

	}

	public boolean equals(Object o) {
		BookEquality book = (BookEquality) o;
		if (this.bookid == book.bookid && this.bookname == book.bookname
				&& this.bookauthor == book.bookauthor)
			return true;
		return false;
	}

}
