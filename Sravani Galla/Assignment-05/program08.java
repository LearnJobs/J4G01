package Assignment05;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class program08 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		
		ArrayList<Integer> squareNumbers = (ArrayList<Integer>) numbers.stream().map(n->n*n).collect(Collectors.toList());
		squareNumbers.forEach(System.out::println);
		
	}
}

