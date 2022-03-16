package com.module3assignment2;

public class Book5 implements Comparable<Book5>{
	String bookName;
	int bookPrice;

	public Book5(String bookName, int bookPrice) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public int hashCode() {
		return this.bookName.length()*1;
	}

	@Override
	public boolean equals(Object obj) {
		Book4 b = (Book4)obj;
		if(this.bookName.equals(b.bookName) && this.bookPrice==(b.bookPrice) )
		return true;
	return false;
	}

	@Override
	public String toString() {
		return "Book = " + bookName + ", bookPrice = " + bookPrice;
	}

	@Override
	public int compareTo(Book5 o) {
		return this.bookName.compareTo(o.bookName);//sort by bookname
	}

}
