package Assignment5;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(17);
		numbers.add(12);
		numbers.add(78);
		numbers.add(45);
		numbers.add(54);
		numbers.add(12);
		numbers.add(30);
		
		ArrayList<Integer> squareNumbers = (ArrayList<Integer>) numbers.stream().map(n->n*n).collect(Collectors.toList());
		squareNumbers.forEach(System.out::println);
	}
}
