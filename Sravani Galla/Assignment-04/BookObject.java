package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class BookObject
{

	public static void main(String[] args) 
	{
     HashMap <Integer ,String> hashMap = new HashMap<>();
     
     hashMap.put(1, "aaa");
     hashMap.put(2, "bbb");
     hashMap.put(3, "ccc");
     hashMap.put(4, "ddd");
     hashMap.put(5, "eee");
     hashMap.put(6, "fff");
     hashMap.put(7, "ggg");
     hashMap.put(8, "hhh");
     hashMap.put(9, "iii");
     hashMap.put(10, "jjj");
     
     
     System.out.println("Itereating hashmap:");
     
     for(Map.Entry m: hashMap.entrySet()) 
    		 {
    	 System.out.println(m.getKey()+" "+m.getValue());
    		 }

	}

}