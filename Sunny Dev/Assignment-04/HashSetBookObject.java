import java.util.*;

public class HashSetBookObject 
{

	public static void main(String[] args)
	{
		HashSet<String> set= new HashSet<String>();
		set.add("Java Book");
		set.add("The Complete Java");
		set.add("Effectiv Java");
		set.add("Thinking in Java");
		set.add("Java Puzzlers");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			System.out.println(str);
		}
	}

}
