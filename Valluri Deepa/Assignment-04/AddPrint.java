import java.util.HashSet;
//import java.util.Iterator;

class BookDemo {
	int id;
	String name, author, publisher;

	public BookDemo(int id, String name, String author, String publisher) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}
	public BookDemo(String string,int i) {
	}
}
	public class AddPrint {
		public static void main(String[] args) {
			HashSet<BookDemo> set = new HashSet<BookDemo>();
			// Creating Books
			BookDemo b1 = new BookDemo(101, "A", "author1", "ZZZ");
			BookDemo b2 = new BookDemo(102, "B", "author2", "YYY");
			BookDemo b3 = new BookDemo(103, "C", "author3", "XXX");
			// Adding Books to HashSet
			set.add(b1);
			set.add(b2);
			set.add(b3);
			// Traversing HashSet
			for (BookDemo b : set) {
				System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher);
			}
		}
	}

