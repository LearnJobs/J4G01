package module;

public class BookIn {
	int bookId;     //integer
	String bookName;    //String
	String bookAuthor;     //String 
	BookIn(int bookId,String bookName,String bookAuthor){
	 this.bookId = bookId;
	this.bookName = bookName;
	this.bookAuthor = bookAuthor;
		
	}
	void display() {
		System.out.println(this.bookId+" , "+this.bookName+ " , "+this.bookAuthor);
	}
		public static void main(String[] args) {
			BookIn myObj = new BookIn (1,"Amma","Sravani");
			myObj.display();
		}
	
	

}
