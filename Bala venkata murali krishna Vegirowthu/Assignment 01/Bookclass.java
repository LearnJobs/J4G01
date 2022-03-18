
public class Bookclass {
Bookclass() {
	System.out.println("Murali") ;
	
}
Bookclass(int i, int j) {
System.out.println("Prakash") ;
}
Bookclass( int i, int j, int k) {
	System.out.println("Sagar") ;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bookclass obj = new Bookclass();
		Bookclass obj2 = new Bookclass(1, 2) ;
		Bookclass obj3 = new Bookclass(1,2,3) ;

	}

}
