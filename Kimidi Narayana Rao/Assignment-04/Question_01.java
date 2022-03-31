
import java.util.ArrayList;
import java.util.Iterator;

public class Question_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Ruby");
		a.add("Java");
		a.add("C Sharp");
		a.add("Python");
		a.add("Eglish");
		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}

	}

}