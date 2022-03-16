// Program 04 : Program to add book object in HashSet and print it

package assignment04;
import java.util.HashSet;
public class BookHashSet {

	public static void main(String[] args) {
		HashSet<Book> bookHashSet = new HashSet<Book>();
		bookHashSet.add(new Book(104,"Java The Complete Reference","Herbert Schildt",540.0));
		System.out.println(bookHashSet);
	}
}
