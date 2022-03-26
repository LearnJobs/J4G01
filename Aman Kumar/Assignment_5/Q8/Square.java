package Q8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Square {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(7);
		numbers.add(9);
		numbers.add(4);
		numbers.add(10);
		numbers.add(6);
		numbers.add(2);
		numbers.add(5);
		
		
		ArrayList<Integer> squareNumbers = (ArrayList<Integer>) numbers.stream().map(n->n*n).collect(Collectors.toList());
		squareNumbers.forEach(System.out::println);
		
	}
}
