package Q5;

import java.io.Serializable;

public class Book implements Serializable {
	int bookId;
	String bookName,bookAuthor;
	
	public Book(int bookId, String bookName, String bookAuthor) {
		 super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	public String toString() {
	 return bookId+" , "+bookName+" , "+bookAuthor;
	}

}
