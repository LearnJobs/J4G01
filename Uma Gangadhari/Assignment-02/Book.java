
public class Book {
	int bookId;
	String bookName;	

	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
	public boolean equals(Object o) {
		Book b=(Book)o;
		if(this.bookId==b.bookId && this.bookName.equals(b.bookName))
			return true;
		return false;
	}
	public static void main(String[] args) {
		
		Book b1=new Book(101,"English");
		Book b2=new Book(102,"Maths");
		
		
			System.out.println(b1.equals(b2));
			}

}
