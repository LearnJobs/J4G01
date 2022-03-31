package conn.listt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class QuestionMain5 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Student> LI = new ArrayList<Student>();
		LI.add(new Student(01,88,"Anshi Gupta"));
		LI.add(new Student(02,45,"Abha Gupta"));
		LI.add(new Student(03,66,"Lavi Gupta"));
		LI.add(new Student(04,52,"Aryan Gupta"));
		LI.add(new Student(05,96,"Abhay Gupta"));
		
		Collections.sort(LI);
		
		for(Student s :LI)
		{
			System.out.println(s);
		}

	}

}
