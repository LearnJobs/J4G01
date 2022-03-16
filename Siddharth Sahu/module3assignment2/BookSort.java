package com.module3assignment2;

import java.util.Comparator;

public class BookSort implements Comparator<Book3> {

	@Override
	public int compare(Book3 o1, Book3 o2) {
		// TODO Auto-generated method stub
		return ((Integer)o1.bookPrice).compareTo(o2.bookPrice);
	}

}
