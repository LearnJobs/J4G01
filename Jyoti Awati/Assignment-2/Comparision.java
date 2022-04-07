

public class Comparision implements Comparable<String> {

		public static void main(String[] args) {
			String string1 = "rajeshwari sirigiri";
			String string2 = "rajeshwari sirigiri";
			
			if(string1.equals(string2))
				System.out.println("Equal");
			else
				System.out.println("Not equal");
			
			if(string1.equalsIgnoreCase(string2))
				System.out.println("Equal");
			else
				System.out.println("Not equal");
			
			int result= string1.compareTo(string2);
			if(result==0)
				System.out.println("Equal");
			else
				System.out.println("Not equal");
			
			if(string1.startsWith("rajeshwari"))
				System.out.println("True");
			else
				System.out.println("False");
			
			if(string1.endsWith("sirigiri"))
				System.out.println("True");
			else
				System.out.println("False");
		}

		@Override
		public int compareTo(String o) {
			return this.compareTo(o);
		}

	}
