package Assignment1;

public class Q2 
{
    static int bookId;
	static String bookName;
	static String bookAuthor;
	Q2()
	{
		this.bookId=0;
		this.bookName="";
		this.bookAuthor="";
	}
	public void printBook(int bookId, String bookName, String bookAuthor)
	{
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		System.out.println("bookId : "+bookId);
		System.out.println("bookName : "+bookName);
		System.out.println("bookAuthor : "+bookAuthor);
	}


		public static void main(String args[])
		{
			Q2 book = new Q2();
			book.printBook(25,"physic","HC verma");
			Q2 book1 = new Q2();
			book1.printBook(26,"operation research","sultan");
			Q2 book2 = new Q2();
			book2.printBook(27,"opps concept","sanjay");
		}
}


	


