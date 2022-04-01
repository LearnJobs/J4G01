package Question10;

import java.util.ArrayList;
import java.util.List;

public class Wordss {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("Spmething");
		ls.add("social");
		ls.add("Morning");
		ls.add("Right");
		ls.add("Someone");
		
		boolean match=ls.stream().anyMatch(s->s.endsWith("ne"));
		System.out.println(match);
	}
}
