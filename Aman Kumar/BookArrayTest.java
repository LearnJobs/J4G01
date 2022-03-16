//import java.util.*;
public class BookArrayTest {
	public static void main(String args[])
	{
		//Scanner sc = new Scanner(System.in);
		BookArray[] bookarray = new BookArray[5];
		/*for(int i=0;i<5;i++)
		{
			int bookId=sc.nextInt();
			String bookName=sc.next();
			String bookAuthor=sc.next();
		}*/
		bookarray[0] = new BookArray(22,"phy","HC verma");
		bookarray[1] = new BookArray(23,"chem","vijay");
		bookarray[2] = new BookArray(24,"bio","john");
		bookarray[3] = new BookArray(25,"history","harry martin");
		bookarray[4] = new BookArray(26,"computer science","carry");
		for(int i=0;i<5;i++)
		{
			bookarray[i].Book();
		}
	}
}
