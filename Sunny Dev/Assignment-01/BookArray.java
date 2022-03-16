
public class BookArray 
{

	public static void main(String[] args) 
	{
		Book[] bookArray = new Book[]
				{
						new Book(100,"The Complete Java","Herbert Schildt"),
						new Book(101,"Core and Advanced Java","Dr.R.Nageswara Rao"),
						new Book(102,"Effectiv Java","Joshua Bloch"),
						new Book(103,"Thinking in Java","Bruce Eckel"),
						new Book(104,"Java Puzzlers","Joshua Bloch,Neal Grafter")
						
				};
		for(Book book:bookArray)
			book.printBook();
		Book book1=new Book();
		book1.printBook();

	}

}
