package com.assignment04;

import java.util.Objects;

public class Book {

	
	public int bookId;
	public String bookName;
	public String bookAuthor;
	public int bookPrice;

	public Book(int bookId, String bookName, String bookAuthor, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookId, bookName, bookPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && bookId == other.bookId
				&& Objects.equals(bookName, other.bookName) && bookPrice == other.bookPrice;
	}

	@Override
	public String toString() {
		return bookId + "," + bookName + "," + bookAuthor + "," + bookPrice;
	}

}
