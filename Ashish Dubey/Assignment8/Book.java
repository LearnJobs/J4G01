package com.Book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;



@Entity
@Table(name = "Book")
public class Book 
{
		@Id
		@Column(name="Bookid")
		Integer BookId;
		
		@Column(name="Bookname")
		String BookName;
		
		@Column(name="Bookauthor")
		String BookAuthor;
		
		public Book() 
		{
		
		}

		public Integer getBookId() {
			return BookId;
		}

		public void setBookId(Integer bookId) {
			BookId = bookId;
		}

		public String getBookName() {
			return BookName;
		}

		public void setBookName(String bookName) {
			BookName = bookName;
		}

		public String getBookAuthor() {
			return BookAuthor;
		}

		public void setBookAuthor(String bookAuthor) {
			BookAuthor = bookAuthor;
			
		}

		public Book(Integer bookId, String bookName, String bookAuthor) {
			super();
			BookId = bookId;
			BookName = bookName;
			BookAuthor = bookAuthor;
			
		}

		@Override
		public String toString() {
			return "Book [BookId=" + BookId + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + "]";
		}
}
