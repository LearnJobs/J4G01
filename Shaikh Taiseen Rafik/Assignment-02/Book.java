package Assignment2;
//question 4 and 5 equality of object and shallow cloning
public class Book {
	
	int bookId;
	String bookName;
	int bookPrice;
	
	public Book(int bookId, String bookName, int bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public static void main(String[] args) {	
		
		Book b1=new Book(101,"Learn Java",1000);
		Book b2=b1;
		System.out.println(b2);
		if(b1.equals(b2))
			System.out.println("Object are Equal");
		else
			System.out.println("Objects are not equal");
		
	}
	
	@Override
	public String toString() {
		return "content of clone object are : bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice;
	}

	

}
