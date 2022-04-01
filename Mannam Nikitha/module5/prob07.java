import java.util.Arrays;
import java.util.List;

public class prob07 {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("nikki","rohini","Nikitha","deepe","suji","shravs","Shanmukha","Mani","Mira","Manisha","Sai","uncle","Ram","Kiran","lochan","lohitha","nitin","sathya","Surya","Naveen");
		
		long nameCount=nameList.stream()
		.filter(name->name.startsWith("n"))
		.count();
		System.out.println("Name which starts from 'n' is "+nameCount);
	}
}