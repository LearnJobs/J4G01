package assignment04;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 03. Hashset
 *
 */
public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> a = new HashSet<Integer>();
		a.add(10);
		a.add(70);
		a.add(9);
		a.add(8);
		a.add(7);
		a.add(5);
		a.add(80);
		System.out.println(a);
		System.out.println("-------------------------");
		Iterator<Integer> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}

	}

}

