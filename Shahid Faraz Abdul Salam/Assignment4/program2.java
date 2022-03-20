import java.util.HashMap;
public class program2 {

	public static void main(String[] args)
	{

		HashMap<String, Integer> map = new HashMap<>();

		map.put("A", 10);
		map.put("B", 30);
		map.put("C", 20);
		map.put("D", 30);
		map.put("E", 20);
		map.put("F", 23);
		map.put("G", 25);
		map.put("H", 26);
		map.put("I", 26);

		System.out.println("Size of map is:- "+ map.size());
		System.out.println(map);

		if (map.containsKey("A")) {

			Integer a = map.get("A");

			System.out.println("value for key"
							+ " \"vishal\" is:- " + a);
		}
	}
}
