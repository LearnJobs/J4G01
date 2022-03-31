

import java.util.HashMap;
import java.util.Map;

public class Question_02 
{

	public static void main(String[] args) 
	{
     HashMap <Integer ,String> hm = new HashMap<>();
     
     hm.put(1, "Raju");
     hm.put(2, "Vijay");
     hm.put(3, "RRR");
     hm.put(4, "Beast");
     hm.put(5, "KGF");
     hm.put(6, "Thoofan");
     hm.put(7, "Delhi");
     hm.put(8, "Kashmir");
     hm.put(9, "Kanyakumari");
     hm.put(10, "Leh");
   
     System.out.println("Keys and Values of HashMaps:");
     
     System.out.println("HashMap Iteration:");
     
     for(Map.Entry m: hm.entrySet()) 
     {
    	 System.out.println(m.getKey()+" "+m.getValue());
     }

	}

}