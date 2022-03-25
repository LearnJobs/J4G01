/* Program 10 : Create a List of 5 Strings, and check if the list contains any string which ends with "te". Use the method anyMatch()
				from Strem	*/

package assignment05;
import java.util.ArrayList;
import java.util.List;

public class CheckStringByAnyMatch {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("Prepare");	words.add("Neglate");	words.add("Weight");
		words.add("create");	words.add("Methods");
		
		boolean match=words.stream().anyMatch(s->s.endsWith("te"));
		System.out.println(match);
	}
}
