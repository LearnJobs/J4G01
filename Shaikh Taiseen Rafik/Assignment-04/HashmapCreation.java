package Assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashmapCreation {

	public static void main(String[] args) {
		
		HashMap <Integer ,String> hm = new HashMap<>();
		hm.put(1, "Taiseen");
		hm.put(2, "Toufik");
		hm.put(3, "Saniya");
		hm.put(4, "Ganesh");
		hm.put(5, "Shubham");
		hm.put(6, "Lata");
		hm.put(7, "Mayuri");
		hm.put(8, "Ruhi");
		hm.put(9, "Rajeshri");
		hm.put(10, "Rajesh");
		
		System.out.println("Iterating...........");
		Iterator<Entry<Integer, String>> i = hm.entrySet().iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}

}
