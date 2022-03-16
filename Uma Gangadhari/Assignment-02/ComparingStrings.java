
public class ComparingStrings {
	

	public static void main(String[] args) {
		String str1="UMA AMMU";
		String str2="Uma Ammu";
				
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.endsWith("AMMU"));
		System.out.println(str1.startsWith("Ammu"));

	}

}
