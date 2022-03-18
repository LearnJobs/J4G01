//module2-4
class Demo {

		// TODO Auto-generated method stub
		int bookid;
		String bookName;
		String bookAuthor;
		
		
		public Demo (int bookid, String bookName, String bookAuthor) {
			//super();
			this.bookid = bookid;
			this.bookName = bookName;
			this.bookAuthor = bookAuthor;
		}

		void printBook()
		{
			System.out.println("bookid is : "+ bookid);
			System.out.println("bookName is : "+ bookName);
			System.out.println("bookAuthor is : "+ bookAuthor);
		}
	 }

public class Quality{

	public static void main(String[] args) {

		Demo cd = new Demo(101, "Deepa", "MD");
		Demo cd1 = new Demo(111, "Deepa", "MD");

		System.out.println(cd.equals(cd1));
		System.out.println(cd.equals(cd));

	}

}
