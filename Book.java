
public class Book {
	public int bookId;
	public String bookName;
	public String bookAuthor;
	public int bookYear;
	
	public Book(int bookId, String bookName, String bookAuthor, int bookYear) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
	}
	public void PrintBook() {
		System.out.println(bookId +","+bookName +","+bookAuthor+","+bookYear);
	}
	
}
