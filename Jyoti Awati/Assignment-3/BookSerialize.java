import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BookSerialize {
	public BookSerialize() {
		try {
			BookSerDeser book = new BookSerDeser();
			FileOutputStream fos = new FileOutputStream("book.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(book);
			oos.close();
			oos.close();
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		} catch(Exception e) {
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BookSerialize();

	}

}
