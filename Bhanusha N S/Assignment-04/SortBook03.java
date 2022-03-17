package com.Assignment04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortBook03 {
	public static void main(String[] args) {

		List<Book03> book = new ArrayList<Book03>();

		book.add(new Book03(01, "java", "uday", 600.0));
		book.add(new Book03(02, "java 8.0", "Agarval", 780.0));
		book.add(new Book03(03, "corejava ", "arun", 400.0));
		book.add(new Book03(04, "python", "daya", 570.0));
		book.add(new Book03(05, "advancedjava", "varun", 976.0));

		book.sort(new Comparator<Book03>() {

			@Override
			public int compare(Book03 b, Book03 b1) {
				// TODO Auto-generated method stub
				return b.price.compareTo(b1.price);
			}
		});
		System.out.println(book);

	}
}
