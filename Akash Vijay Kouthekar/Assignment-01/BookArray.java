//Program 04 : Create Array of 5 book objects & print details of each book

package assignment01;
public class BookArray {

	public static void main(String[] args) {
		Book[] bookArray = new Book[] {
										new Book(101,"Java The Complete Reference","Herbert Schildt"),
										new Book(102,"Core Java","Garry Cornell"),
										new Book(103,"Head First Java","Kathy Sierra"),
										new Book(104,"Thinking In Java","Bruce Eckel"),
										new Book(105,"Java Puzzler","Joshua Bloch")};
				
				for(Book book:bookArray)
						book.printBook();
				
				Book book1=new Book();
				book1.printBook();
		}
}
