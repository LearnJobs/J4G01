package Assignment5;

import java.util.Arrays;
import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		List<Integer> arrayList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		arrayList.forEach(p->System.out.println("Square of "+p+" is "+p*p));
	}

}
