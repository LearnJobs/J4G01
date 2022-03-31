package assigment7;

import java.util.ArrayList;

/**
 * problem no 07
 *
 */
public class StreamAPI07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("bhanuhsa");
		arraylist.add("preethu");
		arraylist.add("bhavya");
		arraylist.add("vijay");
		arraylist.add("Sujith");
		arraylist.add("Shivu");
		arraylist.add("shwetha");
		arraylist.add("vrunda");
		arraylist.add("Manoj");
		arraylist.add("rithu");
		arraylist.add("bhavana");
		arraylist.add("deepa");
		arraylist.add("param");
		arraylist.add("vikram");
		arraylist.add("ajay");
		arraylist.add("ganagamma");
		arraylist.add("padi");
		arraylist.add("pari");
		arraylist.add("gini");
		arraylist.add("datta");
		arraylist.add("indu");
		arraylist.stream().filter(s -> s.startsWith("S")).forEach(s -> System.out.println(s));

	}

}
