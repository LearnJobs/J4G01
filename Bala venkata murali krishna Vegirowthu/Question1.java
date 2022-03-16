
public class Question1 {
	public static void main(String args[]){
		String str1= new String("Hello");
		String str2= new String("Hi");
		System.out.println("str1 equals to str2:"+str1.equals(str2));
		System.out.println("str1 equals to str2:"+str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println("str1 ends with String: "+ str1);
		System.out.println(str1.startsWith("This")); 

}
}
