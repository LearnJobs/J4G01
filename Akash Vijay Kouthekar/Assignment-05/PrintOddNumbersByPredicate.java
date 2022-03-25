//Program 05 : Implement the functional interface Predicate to print only odd numbers from ArrayList. ArrayList consist of 10 integers

package assignment05;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PrintOddNumbersByPredicate {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)		// Instead of adding 10 integers manually i used loop
			numberList.add(i);
		Predicate<Integer> oddNumbers = n->n%2!=0;
		System.out.println("Printing Odd Numbers from 1 to 10");
		for(Integer number : numberList)
			if(oddNumbers.test(number))
				System.out.print(number+" ");
	}
}
