package Q2;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String arhs[])
	{
		HashMap<Integer,String> pinCode = new HashMap<Integer,String>();
		pinCode.put(801503,"patna");
		pinCode.put(411004,"Pune");
		pinCode.put(223007,"Agra");
		pinCode.put(700009,"Kolkata");
		pinCode.put(110001,"New Delhi");
		pinCode.put(400011,"Mumbai");
		pinCode.put(281001,"Mathura");
		pinCode.put(823001,"Gaya");
		
		System.out.println(pinCode);
	}

}
