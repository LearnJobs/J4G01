package assignment1;

public class ParametrizedBook {
	int bookId;
	String bookName;
	String bookAuthor;
	
	
	ParametrizedBook(int bookId,String bookName,String bookAuthor){
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public  void Book() {
		// TODO Auto-generated method stub
		System.out.println("bookId:"+bookId);
		System.out.println("bookName:"+bookName);
		System.out.println("bookAuthor:"+bookAuthor);

	}

}
