package Q5;

public class Students implements Comparable<Students>  {
	int rollNumber,marks;
	String studName;
	@Override
	public String toString() {
		return rollNumber+" , "+marks+" , "+studName;
	}
	public Students(int rollNumber, int marks, String studName) {
		super();
		this.rollNumber = rollNumber;
		this.marks = marks;
		this.studName = studName;
	}
	@Override
	public int compareTo(Students o) {
		return marks>o.marks?1:-1;
	} 

}
