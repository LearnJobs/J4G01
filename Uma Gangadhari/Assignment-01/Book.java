
public class Book {
	int bookId;
	String bookName;
	String bookAuthor;

	public static void main(String[] args) {
		Book book=new Book();
		book.printBook();
		
	}
	public Book()
	{
		bookId=1;
		bookName="Computer";
		bookAuthor="Uma";

	}
public void printBook()
{
	System.out.println("Book Details Are="+bookId+" ,"+bookName+","+bookAuthor);
}
}
