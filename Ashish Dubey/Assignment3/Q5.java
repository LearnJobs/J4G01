package Assignment3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable{
	int bookId;
	String bookName;

 public Book(int bookId, String bookName) {
	// TODO Auto-generated constructor stub
	 this.bookId=bookId;
	 this.bookName=bookName;
}
public String toString() {
	 return bookId+","+bookName;
 }
 }
public class Q5 {
	public static void main(String[] args) throws IOException {
		Book b1=new Book(101,"Core Java");
		Book b2=new Book(102,"Web Development by Mandar Sir");
		Book b3=new Book(101,"Framework V.01 from Milan SIr");
		FileOutputStream fos=new FileOutputStream("E:/read.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(b1);
		System.out.println("Book is serialized!!");
		
	}

}