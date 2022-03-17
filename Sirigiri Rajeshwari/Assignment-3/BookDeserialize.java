import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookDeserialize {
	public BookDeserialize() {
		try {
			BookSerDeser book = new BookSerDeser();
			FileInputStream fis = new FileInputStream("book.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ois.readObject();
			ois.close();
			ois.close();
		}catch(FileNotFoundException e) {
	}catch(IOException e) {
	}catch(Exception e) {
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BookDeserialize();

	}

}
