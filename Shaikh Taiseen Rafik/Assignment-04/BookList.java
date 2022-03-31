package Assignment4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookList {

	public static void main(String[] args) {
		
		 List<Book> bookList = new ArrayList<Book>();
		 
		 bookList.add(new Book(1,"Lessons Life Taught Me Unknowingly","Anupam Kher",200.0));
		 bookList.add(new Book(2,"My Journey","Dr. A.P.J. Abdul Kalam",550.0));
		 bookList.add(new Book(3,"Cricket World Cup: The Indian Challenge","Ashis Ray",350.0));
		 bookList.add(new Book(4,"Beautiful Things’ A Memoir","Hunter Biden ",1200.0));
		 bookList.add(new Book(5,"Unfinished","Priyanka Chopra Jonas ",1800.0));
		 
		 bookList.sort(new Comparator<Book>() {
			@Override
			public int compare(Book book1, Book book2) {
					return book1.bookPrice.compareTo(book2.bookPrice);
			}});
		 System.out.println(bookList);
	}

}
