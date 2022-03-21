package Assignment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Q6 {
	
	/*//class Book implements DeSerializedBook{
		//int bookId;
		//String bookName;

	 public Book(int bookId, String bookName) {
		// TODO Auto-generated constructor stub
		 this.bookId=bookId;
		 this.bookName=bookName;
	}
	public String toString() {
		 return bookId+","+bookName;
	 }
	 }
	public class SerializeBook {
		*/
	public static void main(String[] args) throws IOException, ClassNotFoundException {
			//Book b1=new Book(101,"Core Java"); 
			FileInputStream fis=new FileInputStream("E:/read.txt");  
			ObjectInputStream oos=new ObjectInputStream(fis);
			Book b=(Book)oos.readObject();
			System.out.println(b);
			
		}

	}
