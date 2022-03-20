package assignment04;

public class Book implements Comparable<Book> {
	int id;
	String name;
	String author;
	Double price;

	public Book() {

	}

	public String toString() {
		return "BOOKID : " + id + " BOOKNAME : " + name + " AUTHOR : " + author
				+ " PRICE : " + price + "\n";
	}

	public Book(int id, String name, String author, Double price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public int compareTo(Book b) {
		// TODO Auto-generated method stub
		if (this.price != b.price)
			return 1;

		return 0;

	}

}