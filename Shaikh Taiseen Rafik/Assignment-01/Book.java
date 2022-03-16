public class Book {
	int bookId;
	String bookName;
	String bookAuthor;
	public void printBook() {
		System.out.println(bookId+" , "+bookName+" , "+bookAuthor);
	}

	public Book() {
		// TODO Auto-generated constructor stub
		this.bookId=1;
		this.bookName = "C Programming";
		this.bookAuthor ="Dennis Ritchie";
	}
	public Book(int bookId,String bookName, String bookAuthor) {
		// TODO Auto-generated constructor stub
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor =bookAuthor;
	}
	public static void main(String[] args) {
		Book book =new Book();
		book.printBook();
		
		Book book2 =new Book(101,"Harry Poter","jack");
		book2.printBook();
		
		Book[] bookArray =new Book[] {new Book(110,"Akbarnama","Abdul Fazal"),new Book(111,"Arthashastra","Kautilya"),new Book(112,"A revolutionary Life"," Lakshmi Sehgal"),new Book(113,"Area Of Darkness","v.S.Naipaul"),new Book(114,"By God's Decree","Kapil Dev")};
		for(Book b:bookArray) {
			b.printBook();
		}
	}

}
