package com.assignment04;

import java.util.Comparator;

public class BookSort implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.bookPrice.compareTo(o2.bookPrice);	
		
	}

}
