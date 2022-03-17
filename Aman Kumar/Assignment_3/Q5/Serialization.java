package Q5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Book book1 = new Book(101, "Physics", "HC Verma");

		// Serialization of Book object
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E://java2.txt"));
		objectOutputStream.writeObject(book1);
		System.out.println("Serialization of book object completed");

	}
}
