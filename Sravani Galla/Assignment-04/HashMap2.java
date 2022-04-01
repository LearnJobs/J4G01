package Assignment4;


import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> s = new HashMap<Integer, String>();// Creating HashMap
		s.put(1, "aaa"); // Put elements in Map
		s.put(2, "bbb");
		s.put(3, "ccc");
		s.put(4, "ddd");
		s.put(5, "eee");
		s.put(6, "fff");
		s.put(7, "ggg");
		s.put(8, "hhh");
		s.put(9, "iii");
		s.put(10, "jjj");

		System.out.println(s);
		
		Iterator <Map.Entry<Integer, String>> i= s.entrySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}