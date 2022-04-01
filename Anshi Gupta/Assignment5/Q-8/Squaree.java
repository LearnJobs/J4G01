package Question8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Squaree {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(8);
		numbers.add(4);
		numbers.add(6);
		numbers.add(2);
		numbers.add(7);
		numbers.add(3);
		numbers.add(5);
		
		
		ArrayList<Integer> squareNumbers = (ArrayList<Integer>) numbers.stream().map(n->n*n).collect(Collectors.toList());
		squareNumbers.forEach(System.out::println);
		
	}
}
