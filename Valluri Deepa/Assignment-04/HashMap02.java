import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> m = new HashMap<Integer, String>();// Creating HashMap
		m.put(1, "Mango"); // Put elements in Map
		m.put(2, "Apple");
		m.put(3, "Banana");
		m.put(4, "Grapes");
		m.put(5, "Orange");
		m.put(6, "Dates");
		m.put(7, "Papaya");
		m.put(8, "pineapple");
		m.put(9, "Watermelon");
		m.put(10, "Cashew");

		System.out.println(m);
		System.out.println("-------------------");
		Iterator <Map.Entry<Integer, String>> i= m.entrySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
