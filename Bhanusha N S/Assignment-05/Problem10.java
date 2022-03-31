package assigment7;

import java.util.ArrayList;
import java.util.List;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("classma");
		list.add("school");
		list.add("bhanusha");
		list.add("promo");
		list.add("run");

		boolean anymatch = list.stream().anyMatch(s -> s.endsWith("te"));
		System.out.println(anymatch);

	}

}
