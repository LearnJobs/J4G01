package Q4;

public class EqualsMethod {
	int bookId;
	String bookName;
	public EqualsMethod(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public boolean equals(Object o)
	{
		EqualsMethod e =(EqualsMethod)o;
		if(this.bookId==e.bookId && this.bookName.equals(e.bookName))
			return true;
		return false;
	}
	
	public static void main(String args[])
	{
		EqualsMethod e1 = new EqualsMethod(12,"math");
		EqualsMethod e2 = new EqualsMethod(12,"math");
	
	if(e1.equals(e2))
	{
		System.out.println("Object are equal");
	}
	else
	{
		System.out.println("objects are not equal");
	}
	}

}
