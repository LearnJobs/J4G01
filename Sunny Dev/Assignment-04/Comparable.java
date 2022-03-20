public class Comparable
{

	String firstName;
	String lastName;

	public Comparable (String x, String y) 
	{
		this.firstName = x;
		this.lastName = y;
	}

	public String toString() 
	{
		return  firstName + " , " + lastName ;
	}

	public int compareTo(Comparable a) 
	{
		// if the string are not equal
		if (this.firstName.compareTo(a.firstName) != 0) 
		{
			return this.firstName.compareTo(a.firstName);
		} else 
		{
			// we compare lastName if firstNames are equal
			return this.lastName.compareTo(a.lastName);
		}
	}

} 