
public class BookResult 
{
	int bookId;
	String bookName,bookAuthor;
	public BookResult(int bookId,String bookName,String bookAuthor)
	{
		this.bookId=bookId;
		this.bookName=bookName ;
		this.bookAuthor=bookAuthor;
	}

	public void printBook1()
	{
		System.out.println(bookId+ "," +bookName+ "," +bookAuthor);

	}
}