
public class StringCompareEquals 
{

	public static void main(String[] args) 
	{
		String str1="PassportSeva";
		String str2="passportseva";
		
		System.out.println(str1.equals(str2));             // false
		System.out.println(str1.equalsIgnoreCase(str2));  // true
		
	}

}
