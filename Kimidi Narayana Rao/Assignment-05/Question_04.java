

import java.util.Arrays;
import java.util.List;

public class Question_04 {

	public static void main(String[] args) {
		
		List<Integer> li= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		li.forEach(n->System.out.println("Square of "+n+" is "+n*n));
	}

}