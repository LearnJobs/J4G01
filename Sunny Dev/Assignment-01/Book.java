
public class Book 
{
	int bookId;
	String bookName,bookAuthor;
	
	public Book()
	{
		bookId= 123;
		bookName="Java";
		bookAuthor="James Gosling";

}
	public Book(int bookId, String bookName, String bookAuthor) 
	{
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	public void printBook()
	{
		System.out.println("Book Id:"+bookId+"Book Name:"+bookName+"Book Author:"+bookAuthor+"\n");
	}
}	
	