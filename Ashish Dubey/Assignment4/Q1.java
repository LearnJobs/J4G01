package Assignment4;
public class Q1 implements Comparable<Q1> {
	int bookId;
	String bookName;
	String bookAuthor;
	Double bookPrice;
	public Q1(int bookId, String bookName, String bookAuthor, Double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	@Override
	public int compareTo(Q1 o) {	// Default Natural sorting based on book id
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