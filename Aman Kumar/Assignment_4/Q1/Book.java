package Q1;

public class Book {
	int bookId;
	String bookName, bookAuthor;

	@Override
	public String toString() {
		return bookId+" , "+bookName+" , "+bookAuthor;
	}

	public Book(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

}
