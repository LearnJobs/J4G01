package Q10;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("Prepaid");
		words.add("note");
		words.add("night");
		words.add("illiterate");
		words.add("movie");
		
		boolean match=words.stream().anyMatch(s->s.endsWith("te"));
		System.out.println(match);
	}

}
