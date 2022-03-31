
 class Question_04
{
	int bookId;
	String bookName;
	
	public Question_04(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Question_04 b1 = new Question_04(543,"Wings of Fire");
		Question_04 b2 = new Question_04(787,"Playing");		
		Question_04 b3=b1;
		Question_04 b4 = new Question_04(543,"Wings of Fire");
		
		System.out.println(b1.bookId+" "+b1.bookName);
		System.out.println(b2.bookId+" "+b2.bookName);
		System.out.println(b3.bookId+" "+b3.bookName);
		System.out.println(b4.bookId+" "+b4.bookName);
		
		System.out.println();
		
		System.out.println(b1.equals(b2));
		System.out.println(b2.equals(b1));
		System.out.println(b1.equals(b3));
		System.out.println(b4.equals(b1));
		
	}
	
}


/*
  class BookObjEqual4
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		BookObjEqual4 ob1 = new BookObjEqual4();
		BookObjEqual4 ob2 = new BookObjEqual4();
		
		System.out.println(ob1.equals(ob2));
			
		Object ob3 = ob1;
		System.out.println(ob1.equals(ob3));
		
}
}	
*/
	