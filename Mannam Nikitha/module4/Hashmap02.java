package assignment04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 02.Hash map
 *
 */
public class Hashmap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("Kannada", "Kuvempu");
		m.put("English", "William Shakespeare");
		m.put("Maths", "Arya Bhat");
		m.put("Chemistry", "Lisa Nichols ");
		m.put("History", " Herodotus");
		m.put("Java", "Agarval");
		m.put("C++", "Bjarne Stroustrup");
		m.put("PHP", "Danish-Canadian");
		m.put("C", "Dennis Ritchie");
		m.put("Python", "Guido van Rossum");
		System.out.println(m);
		System.out.println("-------------------------");
		Iterator<Map.Entry<String, String>> i = m.entrySet().iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}