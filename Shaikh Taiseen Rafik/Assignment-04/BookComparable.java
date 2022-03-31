package Assignment4;

import java.util.HashSet;

public class BookComparable {

	public static void main(String[] args) {
		
		HashSet<Book> bhs = new HashSet<Book>();
		bhs.add(new Book(101,"Making of New India","Dr. Bibek Debroy",290.0));
		bhs.add(new Book(102,"Beautiful Things’ A Memoir","Hunter Biden ",1200.0));
		System.out.println(bhs);
	}

}
