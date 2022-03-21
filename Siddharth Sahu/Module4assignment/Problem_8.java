//Create a stream from List, covert all the elements from the List to the square of it and store it
//in other arraylist using Stream API (Use collect method of stream)

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem_8 {

	public static void main(String[] args) {
		List<Integer> arrayList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> arrayStored =  arrayList.stream()
				.map(a->(a*a))
				.collect(Collectors.toList());
		System.out.println(arrayStored);
	}

}
