package Assignment4;
public class Book implements Comparable<Book> {
	int bookId;
	String bookName;
	String bookAuthor;
	Double bookPrice;
	public Book(int bookId, String bookName, String bookAuthor, Double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	@Override
	public int compareTo(Book o) {
		 if(this.bookId<o.bookId)
			 return -1;
		 else if(this.bookId>o.bookId);
		 	return 1;
	}
	@Override
	public String toString() {
		return "Book ID : " + bookId + " Book Name : " + bookName + " Author : " + bookAuthor + " Price : "
				+ bookPrice + "\n";
	}
}