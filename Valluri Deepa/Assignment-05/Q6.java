import java.util.Arrays;
import java.util.List;

public class Q6 {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Deepa","Bhanusha","Nikitha","sai","Priya","Babu","Shanmukha","Mani","Mira","Manisha","Sai","uncle","Ram","Kiran","lochan","lohitha","nitin","sathya","Surya","Naveen");
		nameList.stream()
		.filter(name->name.startsWith("M"))
		.forEach(name->System.out.println(name));
	}
}
