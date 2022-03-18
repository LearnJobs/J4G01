//module2 -2

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "welcome to split world";

		for (String s : s1.split("\\s", 0)) {

			System.out.println(s);
		}

		System.out.println("=================");

		String str = "chinna@Deepa";

		String[] arrOfStr = str.split("@");

		for (String a : arrOfStr)

			System.out.println(a);
	}

}
