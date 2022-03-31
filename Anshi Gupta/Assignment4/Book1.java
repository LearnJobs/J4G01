package Assignment4;

public class Book1
{
	int bookId;
	String bookName, bookAuthor;

	@Override
	public String toString()
	{
		return bookId+" , "+bookName+" , "+bookAuthor;
	}

	public Book1(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
}
