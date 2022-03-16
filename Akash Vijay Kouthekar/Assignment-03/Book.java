// This class is being serialized in BookSerializationDeserialization.java file

package assignment03;
import java.io.Serializable;
public class Book implements Serializable {
		int bookId;
		String bookName,bookAuthor;
		
		public Book(int bookId, String bookName, String bookAuthor) {
			 super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookAuthor = bookAuthor;
		}
		@Override
		public String toString() {
		 return "Book ID : "+bookId+"\nBook Name : "+bookName+"\nAuthor : "+bookAuthor+"\n";
		}
}
