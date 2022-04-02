package com.assignment04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class BookCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book(1, "English", "Uma", 705);
		Book b2 = new Book(2, "Mathematics", "Appu", 950);
		Book b3 = new Book(3, "Hindi", "Mouni", 320);
		Book b4 = new Book(4, "Science", "Bhagya", 845);
		Book b5 = new Book(5, "Social", "Nag", 675);


		TreeSet<Book> nameSet = new TreeSet<Book>();
		nameSet.add(b1);
		nameSet.add(b2);
		nameSet.add(b3);
		nameSet.add(b4);
		nameSet.add(b5);
		
		ArrayList<Book> priceList = new ArrayList<Book>();
		priceList.add(b1);
		priceList.add(b2);
		priceList.add(b3);
		priceList.add(b4);
		priceList.add(b5);

		Collections.sort(priceList, new BookSort());

		for (Book b : priceList) {
			System.out.println(b);
		}

	}

}
