package Assignment5;

import java.util.Arrays;
import java.util.List;

public class FirstElement {

	public static void main(String[] args) {
		List<Integer> arrayList= Arrays.asList( 20, 25, 30, 35, 40, 45, 50, 5, 10, 15);
		int no =arrayList.stream().filter(n->(n>20)).findFirst().get();
		System.out.println(no);
	}
}