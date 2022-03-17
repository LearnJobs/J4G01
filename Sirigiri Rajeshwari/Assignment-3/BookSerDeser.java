
import java.io.Serializable;
public class BookSerDeser implements Serializable  {
	
	public int bookId;
	public String bookName;
	public String bookAuthor;
	public BookSerDeser() {
		this.bookId = 101;
		this.bookName = "Harry Potter";
		this.bookAuthor = "Juke";
	}
	public BookSerDeser(int bookId, String bookName, String bookAuthor) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	
}
	