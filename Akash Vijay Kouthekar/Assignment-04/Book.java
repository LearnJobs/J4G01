// This class is part of Program 01, 03, 04 & 05

package assignment04;
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
	public int compareTo(Book o) {	// Default Natural sorting based on book id
		 if(this.bookId<o.bookId)
			 return -1;
		 else if(this.bookId>o.bookId);
		 	return 1;
	}
	@Override
	public String toString() {
		return "Book ID : " + bookId + "\nBook Name : " + bookName + "\nAuthor : " + bookAuthor + "\nPrice : "
				+ bookPrice + "\n";
	}
}
