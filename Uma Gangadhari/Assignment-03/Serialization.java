package module3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book4 implements Serializable{
	
	int bookId;
	String bookName;
	
	 
	public Book4(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}


	//@Override
	public String toString() {
		return "Book [bookId=" + bookId + " bookName=" + bookName + "]";
	} 
		
}

public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Book4 b1=new Book4(101,"Core Java");
//		FileOutputStream fos=new FileOutputStream("D:\\Book.txt");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\Uma\\eclipse-workspace\\module3\\book.txt"));
		oos.writeObject(b1);
		oos.close();
		System.out.println("Object is Serialized");

	}

}
