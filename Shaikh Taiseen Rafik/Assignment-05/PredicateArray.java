package Assignment5;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateArray { 
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		numberList.add(05);
		numberList.add(10);
		numberList.add(15);	
		numberList.add(20);
		numberList.add(25);
		numberList.add(30);
		numberList.add(35);
		numberList.add(40);
		numberList.add(45);
		numberList.add(50);
		
		Predicate<Integer> oddNumbers = n->n%2!=0;
		System.out.println("Printing Odd Number");
		for(Integer number : numberList)
			if(oddNumbers.test(number))
				System.out.print(number+" ");
	}

}
