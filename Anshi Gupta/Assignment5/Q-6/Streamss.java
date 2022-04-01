package Question6;

import java.util.ArrayList;

public class Streamss {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Anshi");	
		nameList.add("Muskan");	
		nameList.add("Abhay");
		nameList.add("Sandhya");
		nameList.add("Shalini");
		nameList.add("Mohit");
		nameList.add("Malini");	
		nameList.add("M");
		nameList.add("Avinash");
		nameList.add("Madhavi");
		nameList.add("Kaushal");	
		nameList.add("Mandar");
		nameList.add("varandha");	
		nameList.add("Lakshmi");	
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
