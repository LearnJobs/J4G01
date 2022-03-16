// Program 02 : Program to create a HashMap of with atleast 10 key-value pairs

package assignment04;
import java.util.HashMap;
public class PincodeHashMap {

	public static void main(String[] args) {
		 HashMap<Integer, String> pinCodeCity = new HashMap<Integer, String>();
		 pinCodeCity.put(431602, "Nanded");
		 pinCodeCity.put(431001, "Aurangabad City");
		 pinCodeCity.put(411001, "Pune");
		 pinCodeCity.put(400001, "Mumbai");
		 pinCodeCity.put(422001, "Nashik City");
		 pinCodeCity.put(415612, "Ratnagiri");
		 pinCodeCity.put(442001, "Wardha");
		 pinCodeCity.put(431203, "Jalna");
		 pinCodeCity.put(413007, "Solapur City");
		 pinCodeCity.put(431513, "Hingoli");
	 
		 System.out.println(pinCodeCity);	
	}
}
