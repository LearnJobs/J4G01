package Assignment5;

import java.util.ArrayList;
import java.util.List;

public class StringMatch {
	
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		
		words.add("Taiseen");
		words.add("Rafik");
		words.add("Sweete");
		words.add("Jabin");
		words.add("Toufik");
		
		boolean str=words.stream().anyMatch(s->s.endsWith("te"));
		System.out.println(str);
	}

}
