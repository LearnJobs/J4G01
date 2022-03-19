package Assignment1;

public class Q3 
		{
			int bookId;
			String bookName;
		    String bookAuthor;
		
		Q3(int bookId,String bookName,String bookAuthor)
		{
			this.bookId=bookId;
			this.bookName=bookName;
			this.bookAuthor=bookAuthor;
		}
		
		public void Book() {
			System.out.println("bookId : "+bookId);
			System.out.println("bookName : "+bookName);
			System.out.println("bookAuthor : "+bookAuthor);
		}

	public static void main(String args[])
	{
		Q3 book = new Q3 (35,"chemistry","HC verma");
		book.Book();
		Q3 book1 = new Q3 (40,"Biology","sultan");
		book1.Book();
		Q3 book2 = new Q3(45,"math","sanjay");
		book2.Book();
	}
}

		



	

