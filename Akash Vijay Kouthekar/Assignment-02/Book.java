// We are going to create object of this class in BookCheck.java file for program 04
// This class is also part of Program 05 for cloning purpose
package assignment02;
public class Book implements Cloneable {
		int bookId;
		String bookName,bookAuthor;
		
		public Book(int bookId, String bookName, String bookAuthor) {
			 super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookAuthor = bookAuthor;
		}
		
		// We are overriding this method to check that two book objects are equal or not based on our implementation
		@Override
		public boolean equals(Object obj) {
			Book book =(Book)obj;
			return (this.bookId==book.bookId && this.bookName.equals(book.bookName)) && this.bookAuthor.equals(book.bookAuthor);
		}
		@Override
		public String toString() {
			return "bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor;
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		}
}
