// Program 05 : Program to use Comparable interface
// 				Please refer Book class which implements Comparable interface for 
//				default natural sorting order based on book id

package assignment04;
import java.util.TreeSet;
public class BookTreeSet {

	public static void main(String[] args) {
		TreeSet<Book> bookTreeSet = new TreeSet<Book>();
		bookTreeSet.add(new Book(104,"Java The Complete Reference","Herbert Schildt",540.0));
		bookTreeSet.add(new Book(101,"Core Java","Garry Cornell",900.0));
		bookTreeSet.add(new Book(103,"Head First Java","Kathy Sierra",1500.0));
		bookTreeSet.add(new Book(105,"Thinking In Java","Bruce Eckel",290.0));
		bookTreeSet.add(new Book(102,"Java Puzzler","Joshua Bloch",1200.0));
		System.out.println(bookTreeSet);
		// Even though we added book object with random book id it will be automatically
		// get sorted based on book id
	}
}
