package module;

public class book {
	static String bookName;
	static int bookid;
	book(String name,int id) {
		bookName = name;
		bookid = id;
	}

	public static void main(String[] args) {
	
	book myObj = new book("sravani",107);
	System.out.println(bookName+ " , " +bookid);
	
	}
}