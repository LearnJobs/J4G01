package com.example.demo;

public interface BookService {
	public Book_class postBook(Book_class book);
	public Book_class deleteBook(int bookid) throws Exception;

}
