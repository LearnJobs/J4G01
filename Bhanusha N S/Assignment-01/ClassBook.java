package com.assignments01;

public class ClassBook {
	int bookid;
	String bookname;
	String bookauthor;
	public ClassBook(){
		
	}
	public ClassBook(int bookid, String bookname, String bookauthor){
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookauthor=bookauthor;
	}
	public void printbook(){
		System.out.println("Details of the Book:"+this.bookid+" , "+this.bookname+" , "+this.bookauthor );
//		System.out.println("BookID: "+this.bookid);
//		System.out.println("BookName: "+this.bookname);
//		System.out.println("BookAuthor: "+this.bookauthor);
	}
}
