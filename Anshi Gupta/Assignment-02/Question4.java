package CompareString;
public class Question4 {
	int bookId;
	String bookName;
	public Question4(int bookId,String bookName)
	{
		this.bookId=bookId;
		this.bookName=bookName;
	}
	public void display()
	{
		System.out.println("BookId : "+bookId+"BookName : "+bookName);
	}
   public static void main(String[] args)
   {
	   Question4 book1=new Question4(101,"Java");
	   Question4 book2=new Question4(102,"Python");
	   book1.display();
	   book2.display();
	   System.out.print(book1.equals(book2));
	   
   }
}
