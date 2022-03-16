
package Q5;


public class ShallowCloning implements Cloneable {
	int bookId;
	String bookName;
	public ShallowCloning(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public String toString()
	{
		return bookId + "," + bookName;
	}
	public static void main(String args[])
	{
		ShallowCloning emp = new ShallowCloning(22,"computer science");
		ShallowCloning emp1 = null;
		try {
			emp1=(ShallowCloning)emp.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(emp);
		System.out.println(emp1);
	}
	
}
