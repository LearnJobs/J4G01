
public class Question_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("Hello World");
		String s2 = new String("hello world");
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println(s1.equals(s2)); //if strings are eqaul in one case only 
		System.out.println(s1.equalsIgnoreCase(s2)); // It prints output if strings are matched either in uppercase or lowercase
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.endsWith("d"));
		System.out.println(s2.startsWith("h"));

	}

}
