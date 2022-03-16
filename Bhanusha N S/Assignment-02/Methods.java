package com.assignments02;

/**
 * 1.write a program to compare the strings with
 * equals(),equalsIgnoreCase(),compareTo(), endWith(),startsWith()
 * 
 */
public class Methods {
	String animal, animal2;

	public Methods(String animal, String animal2) {
		this.animal = animal;
		this.animal2 = animal2;
	}

	@Override
	public boolean equals(Object obj) {
		Methods m = (Methods) obj;
		if (this.animal.equals(m.animal2))
			return true;
		return false;
	}

	public int compareTo(String animal2) {

		if (this.animal != animal2)
			return 0;
		return 1;
	}

	public boolean endsWith(String animal) {
		if (this.animal.endsWith(animal))
			return true;
		return false;
	}

	public boolean equalsIgnoreCase(String animal2) {
		if (this.animal2.equalsIgnoreCase(animal2))
			return true;
		return false;
	}

	public boolean startsWith(String animal) {
		if (this.animal.startsWith(animal))
			return true;
		return false;
	}

}
