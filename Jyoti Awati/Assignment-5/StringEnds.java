package Assignment5;

//Q : 10

import java.util.Arrays;
import java.util.List;

public class StringEnds {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Create", "Sacrify", "Achievement");
		
		nameList.stream()
		.filter(name->name.endsWith("te"))
		.forEach(name->System.out.println(name));
	}
}
