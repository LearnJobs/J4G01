package Q1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String args[])
	{
		ArrayList<Book> Al = new ArrayList<Book>();
		Al.add(new Book(101,"Physic","HC Verma"));
		Al.add(new Book(102,"Data Structure","Alfred Aho"));
		Al.add(new Book(103,"computer network","Andrew S. Tanenbaum"));
		Al.add(new Book(104,"OOPs Concept"," REEMA THAREJA"));
		Al.add(new Book(105,"Chemistry","R.L Madan"));
		
		Iterator<Book> IL = Al.iterator();
		while(IL.hasNext())
		{
			System.out.println(IL.next());
		}
	}

}
