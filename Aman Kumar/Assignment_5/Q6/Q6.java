package Q6;

import java.util.ArrayList;

public class Q6 {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Aman");	
		nameList.add("Kumud");	
		nameList.add("Abhay");
		nameList.add("Sanjay");
		nameList.add("Shanu");
		nameList.add("Mahesh");
		nameList.add("Malu");	
		nameList.add("");
		nameList.add("Avinash");
		nameList.add("Madhav");
		nameList.add("Kunal");	
		nameList.add("Mandar");
		nameList.add("varun");	
		nameList.add("Ajay");	
		nameList.add("Kiran");
		nameList.add("sunny");	
		nameList.add("Manju");	
		nameList.add("Vaibhav");
		nameList.add("Jagdish");	
		nameList.add("Manish");
		
		nameList.stream()
		.filter(m->m.startsWith("M"))		
		.forEach(m->System.out.println(m));	// iterating mapped names
	}

}
