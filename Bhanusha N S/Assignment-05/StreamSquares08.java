package assigment7;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamSquares08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(5);
		arraylist.add(6);
		arraylist.add(7);
		arraylist.add(8);
		arraylist.add(9);
		arraylist.add(10);
		ArrayList<Integer> square = (ArrayList<Integer>) arraylist.stream().map(n -> n * n)
				.collect(Collectors.toList());
		square.forEach(System.out::println);

	}

}
