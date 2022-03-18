package Used;

import java.util.ArrayList;
import java.util.Iterator;

public class prob01 {//here i create one class
public static void main(String[] args)//this is the main method of the class
{
	ArrayList<String>List=new ArrayList<>();//here i create the array list
	List.add("ram");
	List.add("sam");
	List.add("vam");
	List.add("Jam");
	System.out.println("the list is:"+List);//to print the list
	Iterator<String> iter=List.iterator();//here i m using the iterator 
	System.out.println("\n the iterator values"+ List);//to print the stmt
	while(iter.hasNext()) //here i m using while condition
	{
		System.out.println(iter.next()+" ");//to print the stmt
	}
	
}
	
}
