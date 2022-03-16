// Program 05 : Program to serialize and Deserialize Book object

package assignment03;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookSerializationDeserialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Book book1 = new Book(101,"Wings Of Fire","Dr. APJ Abdul Kalam");
		
		// Serialization of Book object
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D://file.txt"));
		objectOutputStream.writeObject(book1);
		System.out.println("Serialization of book object completed");
		
		// Deserialization of Book object
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D://file.txt"));
		Book deserializedBook = (Book) objectInputStream.readObject();		// this line may throw ClassNotFoundException while reading object		
		System.out.println("Deserialized book details");
		System.out.println(deserializedBook);
	}
}
