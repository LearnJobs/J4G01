class Question_05 implements Cloneable
{
	int bookId;
	String bookName;
	public Question_05(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	


public Object clone() throws CloneNotSupportedException
{
	return super.clone();
}

	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Question_05 b1 = new Question_05(543,"Rajapal ");
			Question_05 b2 = (Question_05)b1.clone();
		
			System.out.println(b1.bookId+" "+b1.bookName);

			System.out.println(b2.bookId+" "+b2.bookName);

		}
		catch(CloneNotSupportedException e)
		{
		
		}

}}
