public class BookDefaCon2
{
	int bookId;
	String bookName;
	String bookAuthor;
	
	 BookDefaCon2()
	 {
		// TODO Auto-generated constructor stub
		bookId =123;
		bookName ="Hello World";
		bookAuthor =" Param";
	 }

	void printBook()
	{
		
		System.out.println("Book Id is: "+bookId);
		System.out.println("Book Name is: "+bookName);
		System.out.println("Book Author is: "+bookAuthor);
		
	}
	
	public static void main(String args[]) 
	{
		BookDefaCon2 b= new BookDefaCon2();
		b.printBook();
		
		
	}
}