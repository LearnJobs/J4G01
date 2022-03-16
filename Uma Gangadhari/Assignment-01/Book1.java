
public class Book1 {
	int bookId;
	String bookName;
	String bookAuthor;
	
	public static void main(String[] args) {
		Book1 book1=new Book1(1,"computer","Uma");
		book1.printBook();				
	}

public Book1(int bookId, String bookName, String bookAuthor) {
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookAuthor = bookAuthor;
}

public void printBook()
{
	System.out.println("Book1 Details Are="+bookId+","+bookName+","+bookAuthor);
}
}
