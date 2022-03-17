package com.Assignment04;

import java.util.Arrays;

public class Main05 {

	public static void main(String[] args) {

		Comparable05[] bookarray1 = new Comparable05[] {
				new Comparable05("java", "uday"),
				new Comparable05("java 8.0", "Agarval"),
				new Comparable05("corejava ", "arun"),
				new Comparable05("python", "daya"),
				new Comparable05("advancedjava", "varun") };

		// Sorting the array
		Arrays.sort(bookarray1);

		// Pair array
		print(bookarray1);
	}

	public static void print(Comparable05[] bookarray1) {
		for (int i = 0; i < bookarray1.length; i++) {
			System.out.println(bookarray1[i]);
		}
	}
}
