
public class BookObjects {
	int bookId;
	String bookName;
	String bookAuthor;
		
public BookObjects(int bookId, String bookName, String bookAuthor)
    {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
public void printBook()
{
System.out.println("BookObjects="+bookId+","+bookName+","+bookAuthor);
}
public static void main(String[] args) 
{

	BookObjects[] bookArray=new BookObjects[] {new BookObjects(1,"computer","Uma"),
											   new BookObjects(2,"cyber","appu"),
											   new BookObjects(3,"java","Mouni"),
											   new BookObjects(4,"Html","Navya"),
											   new BookObjects(5,"css","Arha")};						
												
       for(BookObjects b:bookArray) {        	
        	b.printBook();
        }
}
}
        	
        
        	
												
												
												
		
	
	
	




