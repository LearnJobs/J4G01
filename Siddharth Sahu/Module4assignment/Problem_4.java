//Implement Functional interface Consumer to print the square of elements from ArrayList.
//(Make the use of lambda expression). ArrayList consists of 10 Integers

import java.util.Arrays;
import java.util.List;

public class Problem_4 {

	public static void main(String[] args) {
		List<Integer> arrayList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		arrayList.forEach(p->System.out.println("Square of "+p+" is "+p*p));
	}

}
