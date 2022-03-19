package Assignment1;

import java.util.Scanner;

public class Q4 
{

	 int bookId;
	 String bookName;
	 String bookAuthor;
	Q4 (int bookId,String bookName,String bookAuthor)
		{
			this.bookId=bookId;
			this.bookName=bookName;
			this.bookAuthor=bookAuthor;
		}
	public void Book()
	{
		System.out.println("bookId : "+bookId);
		System.out.println("bookName : "+bookName);
		System.out.println("bookAuthor : "+bookAuthor);
	}
	
	
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			Q4 [] bookarray = new Q4[5];
			//bookarray[i] = new Q4(bookId,bookName,bookAuthor);
			/*for(int i=0;i<5;i++)
			{
				int bookId=sc.nextInt();
				String bookName=sc.next();
				String bookAuthor=sc.next();
				bookarray[i] = new Q4(bookId,bookName,bookAuthor);
			
			}*/
			bookarray[0] = new Q4 (22,"phy","HC verma");
			bookarray[1] = new Q4 (23,"chem","vijay");
			bookarray[2] = new Q4 (24,"bio","john");
			bookarray[3] = new Q4 (25,"history","harry martin");
			bookarray[4] = new Q4(26,"computer science","carry");
			for(int i=0;i<5;i++)
			{
				bookarray[i].Book();
			}
		}
	}




