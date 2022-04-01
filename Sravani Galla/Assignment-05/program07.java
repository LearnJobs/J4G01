package Assignment05;
import java.util.ArrayList;

public class program07 {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("A");	
		nameList.add("B");	
		nameList.add("C");
		nameList.add("D");
		nameList.add("E");
		nameList.add("F");
		nameList.add("G");	
		nameList.add("M");
		nameList.add("H");
		nameList.add("I");
		nameList.add("J");	
		nameList.add("K");
		nameList.add("v");	
		nameList.add("L");	
		nameList.add("M");
		nameList.add("N");	
		nameList.add("O");	
		nameList.add("P");
		nameList.add("Q");	
		nameList.add("U");
		
		nameList.stream()
		.filter(m->m.startsWith("G"))		
		.forEach(m->System.out.println(m));	// iterating mapped names
	}


}


