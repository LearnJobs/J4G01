package Assignment2;

public class StringOperation {

	public static void main(String[] args) {
		String firstString="TAISEEN";
		String secondString="taiseen";
		if(firstString.equals(secondString))
			System.out.println( firstString+" And "+secondString+" String Are Equal ");
		else
			System.out.println( firstString+" And "+secondString+" String Are Not Equal ");
		
		if(firstString.equalsIgnoreCase(secondString))
			System.out.println( firstString+" And "+secondString+" String Are Equal ");
		else
			System.out.println( firstString+" And "+secondString+" String Are Not Equal ");
		
		if(firstString.compareTo("LATA")==0)
			System.out.println("After Comparing with "+firstString+" String Are Equal ");
		else
			System.out.println( "After Comparing with "+ firstString+" String Are Not Equal ");
			
		if(firstString.startsWith("TAI"))
			System.out.println(firstString+" Starts with TAI ");
		else
			System.out.println( firstString+" Not Starts with TAI ");
		
		if(secondString.endsWith("seen"))
			System.out.println( secondString+" Ends with seen ");
		else
			System.out.println( firstString+" Not Ends with seen ");
		
		//Question 2 split()
		
		String mail="shaikh@gmail.com";
		String[] arrayString=mail.split("@",2);
		for(String array :arrayString)
			System.out.println(array);
		
		//Question 3 uppercase lowercase
		
		String state="maharashtra";
		String city="AHMEDNAGAR";
		String upper=state.toUpperCase();
		String lower=city.toLowerCase();
		System.out.println(upper);
		System.out.println(lower);	
	}

}
