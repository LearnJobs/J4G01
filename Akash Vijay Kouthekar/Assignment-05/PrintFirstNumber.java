/* Program 09 : Create the List of 10 integers. Find & print the first element whose value is greated than 20. Use Stream API.
				(use findFirst() method */

package assignment05;
import java.util.ArrayList;
import java.util.List;
public class PrintFirstNumber {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(17);
		number.add(25);
		number.add(9);
		number.add(11);
		number.add(14);
		number.add(32);
		number.add(66);
		number.add(37);
		number.add(41);
		
		/* here i converted list to stream & applied one filter to check that number is greater than 20 or not & then applied findFirst() 
			method for first occurance of number based on filter & then i got this number by using get() method & i assigned to one int
			variable & printed it.
		 */
		int firstNumber =number.stream().filter(n->n>20).findFirst().get();
		System.out.println(firstNumber);
	}
}
