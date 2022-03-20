import java.util.Arrays;
import java.util.List;

//Create a List of 5 strings, and check if the list contains any string which ends with "te". Use the
//method anyMatch() from stream.

public class Problem_10 {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Recreate","Siddhath","Java","Tarika","Irritate");
		
		nameList.stream()
		.filter(name->name.endsWith("te"))
		.forEach(name->System.out.println("Word which ends with 'te' is "+name));
	}
}
