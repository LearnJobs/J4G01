public class BookParamet3
{
	int bookId;
	String bookName;
	String bookAuthor;
	
	public BookParamet3(int bookId, String bookName, String bookAuthor) 
	{
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;	
}

	void printBook()
	{
		
		System.out.println("Book Id is: "+bookId);
		System.out.println("Book Name is: "+bookName);
		System.out.println("Book Author is: "+bookAuthor);		
	}
	
	public static void main(String args[]) 
	{
		BookParamet3 b= new BookParamet3(12345,"Java","James Gosling");
		b.printBook();
			
	}
}