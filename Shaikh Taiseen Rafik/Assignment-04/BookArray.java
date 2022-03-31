package Assignment4;

import java.util.ArrayList;
import java.util.Iterator;

public class BookArray {
	
	public static void main(String[] args) {
		
		ArrayList<String> book = new ArrayList<>();	
		book.add("Java");
		book.add("C Programming");
		book.add("CPP");
		book.add("PHP");
		book.add("Python");
		book.add("Android");
		book.add("Javascript");
		book.add("HTML");
		
		Iterator<String> itr = book.iterator();
		while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }
	}

}
