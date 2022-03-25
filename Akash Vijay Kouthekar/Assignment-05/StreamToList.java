/* Program 08 : Create a Stream from List, Convert all the element from List to square of it & store it in another arraylist using Stream API(use collect() method of stream)  */

package assignment05;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamToList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(7);
		numbers.add(9);
		numbers.add(4);
		numbers.add(10);
		numbers.add(6);
		numbers.add(2);
		numbers.add(5);
		
		// we are assigning stream to arraylist by mapping it by Function(Predefined functional Interface) & collecting it by collect() method as List
		ArrayList<Integer> squareNumbers = (ArrayList<Integer>) numbers.stream().map(n->n*n).collect(Collectors.toList());
		squareNumbers.forEach(System.out::println);
	}
}