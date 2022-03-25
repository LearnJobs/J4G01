/* Program 06 : Create ArrayList of 20 names, And print all the names Starting with 'M' using Stream API in java
 * Program 07 : Find out the number of elements of the same ArrayList which starts with 'S' using stream API
 */
			
package assignment05;
import java.util.ArrayList;
public class NameArrayList {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Akash");	nameList.add("Ravi");	nameList.add("Mahesh");
		nameList.add("Santosh");	nameList.add("Johnny");	nameList.add("Sachin");
		nameList.add("Max");	nameList.add("Punit");	nameList.add("Avinash");
		nameList.add("Madhav");	nameList.add("Kunal");	nameList.add("Mandar Sir");
		nameList.add("varun");	nameList.add("Ajay");	nameList.add("Kiran");
		nameList.add("sunny");	nameList.add("Gajanan");	nameList.add("Vaibhav");
		nameList.add("Jagdish");	nameList.add("Manish");
		
		nameList.stream()
		.filter(s->s.startsWith("M"))		//filtering names that starts with M
		.map(s->s)							// mapping names 
		.forEach(s->System.out.println(s));	// iterating mapped names
		
		long count= nameList.stream().filter(s->s.startsWith("S")).count();
		System.out.println("No of elements starts with 'S' : "+count);
	}
}
