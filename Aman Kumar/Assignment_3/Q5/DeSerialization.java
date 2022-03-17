package Q5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Book book1 = new Book(101,"Physics","HC Verma");
		
		
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E://java2.txt"));
		Book deserializedBook = (Book) objectInputStream.readObject();				
		System.out.println("Deserialized book details");
		System.out.println(deserializedBook);
	}

}
