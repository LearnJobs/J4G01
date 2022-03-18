//module2-1

public class StingComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "This is a test String";
		String str2 = new String("This");
		String str3 = "this";

		System.out.println("String for comparison : " + str1.substring(0, 4));
		System.out.println(str1.substring(0, 4).equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));

		System.out.println("=========== compareTo() methods=================");
		System.out.println(str2.compareTo(str3));
		System.out.println(str2.compareTo(str1.substring(0, 4)));

		System.out.println("=========== startsWith(), endWith() methods=================");
		System.out.println(str1.startsWith("This"));
		System.out.println(str1.endsWith("string"));
		System.out.println(str1.startsWith("test", 10));
		System.out.println(str1.startsWith("test", 12));

	}

}
