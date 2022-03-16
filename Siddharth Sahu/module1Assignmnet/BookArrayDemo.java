package com.module1Assignmnet;

public class BookArrayDemo {

	public static void main(String[] args) {
		
		Book[] bookArray = new Book[] {new Book("Java","GfG",490),
									   new Book("Java10","GfG",350),
									   new Book("Java17","JavaTpoint",1500),
									   new Book("Java16","Guru99",850),
									   new Book("Java14","w3schools",1450)};
		
		for(Book b:bookArray) {
			b.displayBook();
			}
		}
}
