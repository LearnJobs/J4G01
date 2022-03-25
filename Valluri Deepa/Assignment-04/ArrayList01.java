import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList01 {
	
	public static void main(String[] args)
    {
        // Create and populate the list
    	
        ArrayList<String> list = new ArrayList<String>();
  
        list.add("English");
        list.add("Maths");
        list.add("Science");
        list.add("Social");
        list.add("Hindi");
        
  
        // Create an iterator for the list
        // using iterator() method
        
        Iterator<String> a  = list.iterator();
          
  
        // Displaying the values after iterating
        // through the list
        
        //System.out.println("\nThe iterator values" + " of list are: ");
                          
        while (a.hasNext()) {
            System.out.println(a.next());
        }
    }
}
