package Q3;

import java.util.Comparator;
import java.util.Objects;

public class Book  {
	int bookId;
	double bookPrice;
	String bookName;
	String bookAuthor;

	public Book(int bookId, double bookPrice, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookPrice = bookPrice;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	@Override
	public String toString() {
		return " BookId : " + bookId + " , " + "BookPrice : " + bookPrice+" , " + "BookName : " + bookName + " , "
				+ "BookAuthor : " + bookAuthor;
	}

}	


