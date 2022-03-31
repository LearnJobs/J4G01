
import java.util.Arrays;
import java.util.List;

public class Question_07 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ajay","Raju","Kumar","Sahoo","Mukesh","Sachin","Mahindra","Satish","Nani","Pandya","Ram","Raheem","Rajesh","Hardik","Laxmi","Kohli","Dhoni","Bumrah","Manisha","Mira");
		names.stream()
		.filter(name->name.startsWith("S"))
		.forEach(name->System.out.println(name));
	}

}