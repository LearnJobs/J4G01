public class ArrBook {
	public static void main(String[] args) 
	{
		BookResult a1=new BookResult(101,"c","ansi");
		BookResult a2=new BookResult(101,"c","ansi");
		BookResult a3=new BookResult(101,"c","ansi");
		BookResult[] book={a1,a2,a3};
		
		for(BookResult aa:book)
		{
			aa.printBook1();
		}
	}

}
