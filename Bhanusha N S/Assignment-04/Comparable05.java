package com.Assignment04;

/**
 * 05.Program to use Comparable interface
 *
 */
public class Comparable05 implements Comparable<Comparable05> {

	String firstName;
	String lastName;

	public Comparable05(String x, String y) {
		this.firstName = x;
		this.lastName = y;
	}

	public String toString() {
		return  firstName + " , " + lastName ;
	}

	@Override
	public int compareTo(Comparable05 a) {
		// if the string are not equal
		if (this.firstName.compareTo(a.firstName) != 0) {
			return this.firstName.compareTo(a.firstName);
		} else {
			// we compare lastName if firstNames are equal
			return this.lastName.compareTo(a.lastName);
		}
	}

}
