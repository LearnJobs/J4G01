package Q5;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Odd_Number {
	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		numberList.add(7);
		numberList.add(8);
		numberList.add(9);
		numberList.add(10);
		Predicate<Integer> oddNumbers = n->n%2!=0;
		System.out.println("Printing Odd Numbers from 1 to 10");
		for(Integer number : numberList)
			if(oddNumbers.test(number))
				System.out.print(number+" ");
	}

}
