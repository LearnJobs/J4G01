import java.util.ArrayList;

class Book {
	int id;
	String name, author;
	Double price;

	public Book(int id, String name, String author, double price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;

	}
}

public class CreateBook {
	public static void main(String[] args) {
		// Creating list of Books
		ArrayList<Book> list = new ArrayList<Book>();
		// Creating Books
		Book b1 = new Book(101, "With English be Distinguished", "Sapna Narayan", 500);
		Book b2 = new Book(102, "Wings of Fire", "Dr. A.P.J. Abdul Kalam", 5000);
		Book b3 = new Book(104, "Unfinished", "Priyanka Chopra Jonas", 3000);
		Book b4 = new Book(103, "Names of the Women", "Jeet Thayil", 7000);
		Book b5 = new Book(100, "The India Story ", "Bimal Jalan", 2000);

		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		// Traversing list
		System.out.println("Before Sorting");
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.price);
		}
		
	}
}
