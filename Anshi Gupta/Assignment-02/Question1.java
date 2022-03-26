package CompareString;

public class Question1 {

	public static void main(String[] args) {
		String s1="Anshi Gupta";
		String s2="anshi gupta";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s ="My name is anshi gupta";
		System.out.println(s.startsWith("my"));
		System.out.println(s.endsWith("gupta"));
		

	}

}
