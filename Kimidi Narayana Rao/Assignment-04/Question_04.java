

import java.util.HashSet;

class Book
{
	int id;
	String bookname,author;
	public Book(int id, String bookname, String author) {
		
		this.id = id;
		this.bookname = bookname;
		this.author = author;
	}
	
}
public class Question_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Book> hs = new HashSet<Book>();
		
		Book b1 = new Book(112,"C- language","D Ritche");
		Book b2 = new Book(187,"Python- language","Van der dussain");
		Book b3 = new Book(897,"Java- language","Zeopardy");
		
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		
		for(Book b:hs)
			System.out.println("Book Id: "+b.id+"; "+"Book Name: "+b.bookname+" ;"+b.author+" ");

	}

}
