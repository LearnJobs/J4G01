package Assignment5;
import java.util.Arrays;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Ashish","Siddharth","Yashwant","Tarika","Yashika","Sachin","Sanmukh","Manish","Meenal","Mayak","Shivam","Ankur","Ram","Kamlesh","Rohan","Rohit","Mili","Mohit","Shubham","Nitish");
		nameList.stream()
		.filter(name->name.startsWith("M"))
		.forEach(name->System.out.println(name));
	}

}
