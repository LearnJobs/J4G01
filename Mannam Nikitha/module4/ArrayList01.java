package assignment04;

//to create and print arraylist of book
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Java Text book");
		a.add("telugu");
		a.add("Science");
		a.add("tamil");
		a.add("Eglish");
		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}

	}

}