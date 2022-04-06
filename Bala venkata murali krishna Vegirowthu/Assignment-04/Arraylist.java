import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Java Text book");
		a.add("Maths");
		a.add("Science");
		a.add("physics");
		a.add("Eglish");
		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}

	}

}
