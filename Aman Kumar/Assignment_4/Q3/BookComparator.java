package Q3;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		if(o1.bookPrice==o2.bookPrice)
		{
			return 0;
		}
		else if(o1.bookPrice>o2.bookPrice)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}

}
