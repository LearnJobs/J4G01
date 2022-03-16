// Program 01 : Write a program to create and print ArrayList of Books(Use Iterator)

package assignment04;
import java.util.ArrayList;
import java.util.Iterator;
public class BookArrayList {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<Book>();
		 bookList.add(new Book(104,"Java The Complete Reference","Herbert Schildt",540.0));
		 bookList.add(new Book(101,"Core Java","Garry Cornell",900.0));
		 bookList.add(new Book(103,"Head First Java","Kathy Sierra",1500.0));
		 bookList.add(new Book(105,"Thinking In Java","Bruce Eckel",290.0));
		 bookList.add(new Book(102,"Java Puzzler","Joshua Bloch",1200.0));
		 
		 Iterator<Book> bookIterator= bookList.iterator();		// Created bookIterator
		 while(bookIterator.hasNext())							// checking bookIterator has any next element
			 System.out.println(bookIterator.next());			// printing element;
	}

}
