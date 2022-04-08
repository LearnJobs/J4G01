package com.example.demo;

public interface BookServicee {
	public BookMain postBook(BookMain book);
	public BookMain deleteBook(int bookid) throws Exception;

}