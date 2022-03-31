package Assignment4;
import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				ArrayList<Book1> Al = new ArrayList<Book1>();
				Al.add(new Book1(101,"Physic","HC Verma"));
				Al.add(new Book1(102,"Data Structure","Alfred Aho"));
				Al.add(new Book1(103,"computer network","Andrew S. Tanenbaum"));
				Al.add(new Book1(104,"OOPs Concept"," REEMA THAREJA"));
				Al.add(new Book1(105,"Chemistry","R.L Madan"));
				
				Iterator<Book1> IL = Al.iterator();
				while(IL.hasNext())
				{
					System.out.println(IL.next());
				}

	}

}
