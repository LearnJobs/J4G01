package Assignment5;

//Q : 6 and 7

import java.util.Arrays;
import java.util.List;

public class NStream {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Gayathri", "Rajeshwari", "Sanjana", "Riya", "Maneesha",
				                                       "Manogna", "Sam", "Megha", "Pooja", "Ashwini",
				                                       "Anusha", "Sirisha", "Lavanya", "Samskruta", "Astra",
				                                       "Nikitha", "Komal", "Sandhya", "Ankitha", "Neha");
		System.out.println("Start with M Letter");
		nameList.stream()
		.filter(name->name.startsWith("M"))
		.forEach(name->System.out.println(name));
		
		System.out.println("............................................");
		
		System.out.println("Start with S Letter");
		nameList.stream()
		.filter(name->name.startsWith("S"))
		.forEach(name->System.out.println(name));
	}

}
