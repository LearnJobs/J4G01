public class Book {
	 int bookId;
	 String bookName;
	 String bookAuthor;
	Book()
	{
		this.bookId=0;
		this.bookName="";
		this.bookAuthor="";
	}
	public void printBook(int bookId,String bookName,String bookAuthor)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		System.out.println("bookId : "+bookId);
		System.out.println("bookName : "+bookName);
		System.out.println("bookAuthor : "+bookAuthor);
	}
	
	
}
