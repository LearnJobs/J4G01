
public class Prob4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        String myName1 = "Book";
		        String myName2 = myName1; // references myName
		       

		        if (myName1 == myName2)
		            System.out.println("Instance equivalence: " + myName1 + " & " + myName2);//to print the instance(normal method) equivalence

		        if (myName1.equals(myName2))
		            System.out.println("Logical equivalence: " + myName1 + " & " + myName2);// to print the logical equivalence by using logics		
		
	}

}
