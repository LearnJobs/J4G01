/*Write program to create Book class with attributes: id,name, author and price.
       Create 5 objects and add it in List. Write a program to sort this list on the basis of the price
       (Hint use Comparator interface)
*/

package com.module3assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Problem_3 {

	public static void main(String[] args) {

		Book3 b1 = new Book3(101, "Java", "JavaTpoint", 680);
		Book3 b2 = new Book3(102, "Python", "GFG", 540);
		Book3 b3 = new Book3(103, "Ruby", "TutorialsPoint", 780);
		Book3 b4 = new Book3(104, "C#", "youtube", 350);
		Book3 b5 = new Book3(105, "Flutter", "GFG", 860);

		ArrayList<Book3> bookList = new ArrayList<Book3>();
		bookList.add(b1);bookList.add(b2);bookList.add(b3);bookList.add(b4);bookList.add(b5);

		Collections.sort(bookList, new BookSort());

		Iterator<Book3> bookIterator = bookList.iterator();
		while (bookIterator.hasNext()) {
			System.out.println(bookIterator.next());
		}

	}
}
