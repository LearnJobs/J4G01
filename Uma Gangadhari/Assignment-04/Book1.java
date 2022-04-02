package com.assignment04;

import java.util.Objects;

public class Book1 {

	int bookId;
	String bookName;

	public Book1(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;

	}

	@Override
	public int hashCode() {
		return Objects.hash(bookId, bookName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book1 other = (Book1) obj;
		return bookId == other.bookId && Objects.equals(bookName, other.bookName);
	}

	@Override
	public String toString() {
		return bookId + "," + bookName;
	}

}
