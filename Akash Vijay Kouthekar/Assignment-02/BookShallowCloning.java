// Program 05 : Implementing Shallow cloning for existing Book class

package assignment02;
public class BookShallowCloning
{		 
		public static void main(String[] args) throws CloneNotSupportedException
		{
			Book book1 = new Book(101,"Harry Potter","J.K. Rowling");
			System.out.println("Content of Book1 Object : "+book1);
			
			Book book2 = (Book)book1.clone();
			System.out.println("Content of Cloned book object : "+book2);
		}		
}
