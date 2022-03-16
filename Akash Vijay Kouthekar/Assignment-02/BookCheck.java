// Program 04 : Check the equality of Book object using equals() method

package assignment02;
public class BookCheck 
{
	public static void main(String[] args) {
			Book book1 = new Book(101,"Harry Potter","J.K. Rowling");
			Book book2 = new Book(101,"Harry Potter","J.K. Rowling");
			
			if(book1.equals(book2))
				System.out.println("Objects are equal");
			else
				System.out.println("Objects are not equal");
	}
}
