//Create the List of 10 integers. Find and print the first element whose value is greater than 20.
//Use stream API. (use the method findFirst())

import java.util.Arrays;
import java.util.List;

public class Problem_9 {

	public static void main(String[] args) {
		List<Integer> arrayList= Arrays.asList(10,20,30,40,25,16,7,18,39,10);
		int no =arrayList.stream().filter(n->(n>20)).findFirst().orElse(null);
		System.out.println(no);
	}
}
