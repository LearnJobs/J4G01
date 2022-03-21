package Assignment5;

import java.util.Arrays;
import java.util.List;

public class Q7 {

	public static void main(String[] args) {
			List<String> nameList = Arrays.asList("Ashish","Siddharth","Yashwant","Tarika","Yashika","Sachin","Sanmukh","Manish","Meenal","Mayak","Shivam","Ankur","Ram","Kamlesh","Rohan","Rohit","Mili","Mohit","Shubham","Nitish");
			
			long nameCount=nameList.stream()
			.filter(name->name.startsWith("S"))
			.count();
			System.out.println("Name which starts from 'S' is "+nameCount);
		}
}
