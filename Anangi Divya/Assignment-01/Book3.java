package module;

public class Book3 {
	static String bookName;
	static int bookid;
	
	Book3(String name,int id){
		bookName=name;
		bookid=id;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book3 obj=new Book3("xyz",101);
		System.out.println(bookName+" , "+bookid);
	}

}
