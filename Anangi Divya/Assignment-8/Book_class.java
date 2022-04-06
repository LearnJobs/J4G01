package com.example.demo;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;

	@Entity
	public class Book_class {
		
	    @Id
	    @GeneratedValue
		Integer bookid;
		String bookname;
		String bookauthor;
		
		public Book_class(){
			
		}
		public Integer getBookid1() {
			return bookid;
		}
		public void setBookid1(Integer bookid) {
			this.bookid = bookid;
		}
		public String getBookname1() {
			return bookname;
		}
		public void setBookname1(String bookname) {
			this.bookname = bookname;
		}
		public String getBookauthor1() {
			return bookauthor;
		}
		public void setBookauthor1(String bookauthor) {
			this.bookauthor = bookauthor;
		}
		public Book_class(Integer bookid, String bookname, String bookauthor) {
			super();
			this.bookid = bookid;
			this.bookname = bookname;
			this.bookauthor = bookauthor;
		}
		@Override
		public String toString() {
			return "Book_class [bookid1=" + bookid + ", bookname1=" + bookname + ", bookauthor1=" + bookauthor + "]";
		}
		
		
	}
	