//module1-4
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an array of product object

		BookDemo[] obj = new BookDemo[5];

		// create & initialize actual product objects using constructor
		obj[0] = new BookDemo(101, "Pince Of Persia", "shylock");
		obj[1] = new BookDemo(1002, "The Powers of The Mind", "Swami Vivekananda");
		obj[2] = new BookDemo(1003, "My Play is Done", "Swami Vivekananda");
		obj[3] = new BookDemo(104, "Ideas and Opinions", "Albert Einstein");

		// display the product object data
		System.out.println("Product Object 1:");
		obj[0].display();
		System.out.println("Product Object 2:");
		obj[1].display();
		System.out.println("Product Object 3:");
		obj[2].display();
		System.out.println("Product Object 4:");
		obj[3].display();
		System.out.println("Product Object 5:");
		obj[4].display();
	}
}

// Product class with product Id and product name as attributes
class BookDemo {
	int bookid;
	String bookName;
	String bookAuthor;

	// Product class constructor
	BookDemo(int id, String name, String author) {
		bookid = id;
		bookName = name;
		bookAuthor = author;
	}

	public void display() {
		System.out.print("Product Id = " + bookid + "  " + " Product Name = " + bookName + "	" + " Product Author = "
				+ bookAuthor);
		System.out.println();
	}
}
