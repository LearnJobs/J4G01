// Program 02 : Write a program to create Book class with bookId, bookName, bookAuthor
//				Create a book object with default constructor & class should also contain
//				printBook() method

package assignment01;
public class Book {
	int bookId;
	String bookName,bookAuthor;
	
	public Book() {		//Default constructor
		bookId=2222;
		bookName="Harry Potter";
		bookAuthor="J. K. Rowlling";
	}
	public Book(int bookId, String bookName, String bookAuthor) {
		 super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	public void printBook()
	{
		System.out.println("Book Id : "+bookId+"\nBook Name : "+bookName+"\nAuthor : "+bookAuthor+"\n");
	}

}
