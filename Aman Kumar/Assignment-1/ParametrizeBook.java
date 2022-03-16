
public class ParametrizeBook {
		 int bookId;
		 String bookName;
		 String bookAuthor;
		
		ParametrizeBook(int bookId,String bookName,String bookAuthor)
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
		
}
