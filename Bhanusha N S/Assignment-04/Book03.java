package com.Assignment04;

public class Book03 implements Comparable<Book03> {
	int id;
	String name;
	String author;
	Double price;

	public Book03() {

	}

	public String toString() {
		return "BOOKID : " + id + " BOOKNAME : " + name + " AUTHOR : " + author
				+ " PRICE : " + price + "\n";
	}

	public Book03(int id, String name, String author, Double price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public int compareTo(Book03 b) {
		// TODO Auto-generated method stub
		if (this.price != b.price)
			return 1;

		return 0;

	}

}
