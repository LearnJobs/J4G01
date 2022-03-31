package Assignment5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q8 {

	public static void main(String[] args) {
		List<Integer> arrayList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> arrayStored =  arrayList.stream()
				.map(a->(a*a))
				.collect(Collectors.toList());
		System.out.println(arrayStored);
	}

}
