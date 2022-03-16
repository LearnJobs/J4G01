import java.util.*;
public class ArrayListBook
{

	public static void main(String[] args) 
	{
		ArrayList<String> list= new ArrayList<String>();
		list.add("Java Book");
		list.add("The Complete Java");
		list.add("Effectiv Java");
		list.add("Thinking in Java");
		list.add("Java Puzzlers");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
					System.out.println(str);
		}

	}

}
