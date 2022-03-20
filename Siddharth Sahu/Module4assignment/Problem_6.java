//Create a ArrayList of 20 names, and print all the names starting with 'M' 
//using Stream API in Java.

import java.util.Arrays;
import java.util.List;

public class Problem_6 {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Ashish","Siddharth","Yashwant","Tarika","Yashika","Sachin","Sanmukh","Manish","Meenal","Mayak","Shivam","Ankur","Ram","Kamlesh","Rohan","Rohit","Mili","Mohit","Shubham","Nitish");
		nameList.stream()
		.filter(name->name.startsWith("M"))
		.forEach(name->System.out.println(name));
	}

}
