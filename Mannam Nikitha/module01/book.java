package module3;

import com.code.Book;

public class book {
	
	int bookid=101;
	String bookName="Prince of Persia";
	String bookAuthor="shylock";
	
	
	public Book() {
		//super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	void printBook()
	{
		System.out.println("bookid is : "+ bookid);
		System.out.println("bookName is : "+ bookName);
		System.out.println("bookAuthor is : "+ bookAuthor);
	}
	
	public static void main(String[] args) {
		
		Book book =new Book();
		book.printBook();
		
	}
}




