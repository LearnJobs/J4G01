package Assignment5;

//Q : 5

import java.util.ArrayList;
import java.util.function.Predicate;

public class OddNum {

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
			numberList.add(i);
		Predicate<Integer> oddNumbers = (n->n%2!=0);
		for(Integer number : numberList)
			if(oddNumbers.test(number))
				System.out.print(number+" ");
	}
}