package conn.listt;

public class Student implements Comparable<Student>  {

	int rollNumber,marks;
	String studName;
	@Override
	public String toString() {
		return rollNumber+" , "+marks+" , "+studName;
	}
	public Student(int rollNumber, int marks, String studName) {
		super();
		this.rollNumber = rollNumber;
		this.marks = marks;
		this.studName = studName;
	}
	public int compareTo(Student o) {
		return marks>o.marks?1:-1;
	} 
}
