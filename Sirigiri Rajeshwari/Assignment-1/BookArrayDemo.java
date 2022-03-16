
public class BookArrayDemo {

	public static void main(String[] args) {
		Book[] bookArray = new Book[] {new Book(101,"Java", "thanu",1999),
			                        	new Book(102,"SQL", "sam",2001),
			                        	new Book(103,"Html", "vlyad",1998 ),
			                        	new Book(104,"Jsp","sanny", 1999),
			                        	new Book(105,"Hibernet","sony",2005)};
		for(Book b : bookArray) {
			b.PrintBook();
		}
	}
}
	
		
	

	
	


