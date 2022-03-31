
import java.util.Arrays;
import java.util.List;

public class Question_06 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ajay","Raju","Kumar","Taman","Mukesh","Sachin","Mahindra","Manish","Nani","Pandya","Ram","Raheem","Rajesh","Hardik","Laxmi","Kohli","Dhoni","Bumrah","Manisha","Mira");
		names.stream()
		.filter(name->name.startsWith("M"))
		.forEach(name->System.out.println(name));
	}

}