package Q5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StudTest {
	public static void main(String args[])
	{
		List<Students> LI = new ArrayList<Students>();
		LI.add(new Students(01,88,"Aman Kumar"));
		LI.add(new Students(02,45,"Akshay Kumar"));
		LI.add(new Students(03,66,"Abhay Kumar"));
		LI.add(new Students(04,52,"AJay Kumar"));
		LI.add(new Students(05,96,"Arun Kumar"));
		
		Collections.sort(LI);
		
		for(Students s :LI)
		{
			System.out.println(s);
		}
	}

}
