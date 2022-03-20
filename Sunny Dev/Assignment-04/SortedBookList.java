import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class SortedBookList {

	public static void main(String[] args) {
		 List<Book> bookList = new ArrayList<Book>();
		 bookList.add(new Book(104,"Java The Complete Reference","Herbert Schildt",540.0));
		 bookList.add(new Book(101,"Core Java","Garry Cornell",900.0));
		 bookList.add(new Book(103,"Head First Java","Kathy Sierra",1500.0));
		 bookList.add(new Book(105,"Thinking In Java","Bruce Eckel",290.0));
		 bookList.add(new Book(102,"Java Puzzler","Joshua Bloch",1200.0));
		 
		 //This sorting is based on price of the book by using Comparator.
		 //As it is the one time requirement so i'm using anonymous inner class.
		 // If requirement is multiple time then we can go with seperate class
		 bookList.sort(new Comparator<Book>() {
			 				@Override
			 				public int compare(Book book1, Book book2) {
			 						return book1.bookPrice.compareTo(book2.bookPrice);
			 			}});
		 System.out.println(bookList);
	}
}