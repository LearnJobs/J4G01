package Q1;

public class CompareString {
	String s1="Aman";
	String s2="Abhay";
	String s3="Aman";
	public void Equals()
	{
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
	public void equalsIgnoreCase()
	{
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
	}
	public void compareTo() {
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}
	public void endWith()
	{
		System.out.println(s1.endsWith(s2));
		System.out.println(s2.endsWith(s1));
	}
	public void startWith()
	{
		System.out.println(s1.startsWith(s3));
		System.out.println(s2.startsWith(s3));
	}
			
	

}
