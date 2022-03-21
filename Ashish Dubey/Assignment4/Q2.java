package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class Q2 
{

	public static void main(String[] args) 
	{
     HashMap <Integer ,String> hashMap = new HashMap<>();
     
     hashMap.put(1, "Akbar Ali");
     hashMap.put(2, "Atul");
     hashMap.put(3, "Aman");
     hashMap.put(4, "Ashish");
     hashMap.put(5, "Anshi");
     hashMap.put(6, "Satyam");
     hashMap.put(7, "Shubham");
     hashMap.put(8, "Shraddha");
     hashMap.put(9, "Abhay");
     hashMap.put(10, "Abu");
     hashMap.put(11, "Akbar Ali");
     hashMap.put(12, "Akbar Ali");
     
     System.out.println("Itereating hashmap:");
     
     for(Map.Entry m: hashMap.entrySet()) 
    		 {
    	 System.out.println(m.getKey()+" "+m.getValue());
    		 }

	}

}
