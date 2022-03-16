package com.module2assignment;
//  5. Implement the shallow cloning to create copy of existing Book object.

public class Problem_5 implements Cloneable {

	int bookPrice;
	String bookName;

	public Problem_5(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "bookPrice = " + bookPrice + ", bookName = " + bookName;
	}

	public static void main(String[] args) {
		Problem_5 book1 = new Problem_5("Java", 360);
		Problem_5 book2 = null;
		try {
			book2 = (Problem_5) book1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("Content of book 1 : " + book1);
		System.out.println("Content of book 2 : " + book2);

		System.out.println("hash of book 1 : " + book1.hashCode());
		System.out.println("hash of book 2 : " + book2.hashCode());
	}

}
