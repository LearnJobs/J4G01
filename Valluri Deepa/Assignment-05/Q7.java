import java.util.Arrays;
import java.util.List;

public class Q7 {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Deepa","Bhanusha","Nikitha","sai","Priya","Babu","Shanmukha","Mani","Mira","Manisha","Sai","uncle","Ram","Kiran","lochan","lohitha","nitin","sathya","Surya","Naveen");
		
		long nameCount=nameList.stream()
		.filter(name->name.startsWith("S"))
		.count();
		System.out.println("Name which starts from 'S' is "+nameCount);
	}
}
