
public class Book 
{
	int bookId;
	String bookName,bookAuthor;
	public Book()
	{
		bookId=101;
		bookName="java";
		bookAuthor = "P K sinha";
	}
	public Book(int bookId,String bookName,String bookAuthor)
	{
		this.bookId=bookId;
		this.bookName=bookName ;
	    this.bookAuthor=bookAuthor;
	}
	
	public void printBook()
	{
		System.out.println("bookid is :"+bookId);
		System.out.println("name of the book is "+bookName);
		System.out.println("Author of the Book is "+bookAuthor);
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book book1=new Book();

}
