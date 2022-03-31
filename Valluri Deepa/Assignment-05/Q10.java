import java.util.Arrays;
import java.util.List;

public class Q10 {
	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Deepa","Priya","sai","Devante");
		
		nameList.stream()
		.filter(name->name.endsWith("te"))
		.forEach(name->System.out.println("Word which ends with 'te' is "+name));
	}
}
