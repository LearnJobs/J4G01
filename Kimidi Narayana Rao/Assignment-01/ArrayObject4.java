class Bookk
{
	int bookId;
	String bookName;
	String bookAuthor;
	
	public Bookk(int bId, String bName, String bAuthor)
	{
		bookId = bId;
		bookName = bName;
		bookAuthor = bAuthor;
	}
	
	void display()
	{
		System.out.println("Book Id: "+bookId+ "; " +"Book Name: "+bookName+"; " +"Book Author: " +bookName);		
	}
	
}

public class ArrayObject4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bookk[] bo = new Bookk[5];
		bo[0] = new Bookk(123,"C", "Dennis");
		bo[1] = new Bookk(345,"Java","James");
		bo[2] = new Bookk(678,"Python","Van");
		bo[3] = new Bookk(910,"C++","Rossian");
		bo[4] = new Bookk(0123,"React","Reactyoo");
		
		
		for(Bookk i: bo )
			i.display();
	}

}
