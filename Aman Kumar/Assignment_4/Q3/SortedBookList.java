package Q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortedBookList {
	public static void main(String args[])
	{
		 List<Book> bList = new ArrayList<Book>();
		 bList.add(new Book(104,540.00,"Ab","H"));
		 bList.add(new Book(101,900.00,"xsd","B"));
		 bList.add(new Book(103,1500.00,"Fds","M"));
		 bList.add(new Book(105,290.0,"Kds","L"));
		 bList.add(new Book(102,1200.0,"Jds","P"));
		 
		Collections.sort(bList,new BookComparator());
		 
		 for(Book b:bList)
		 {
			 System.out.println(b);
		 }
		 
	}

}
