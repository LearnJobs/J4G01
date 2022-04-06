import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> bList = new ArrayList<Book>();
		 bList.add(new Book(104,"Ab","H"));
		 bList.add(new Book(101,"xsd","B"));
		 bList.add(new Book(103,"Fds","M"));
		 bList.add(new Book(105,"Kds","L"));
		 bList.add(new Book(102,"Jds","P"));
		 
		Collections.sort(bList,new BookComparator());
		 
		 for(Book b:bList)
		 {
			 System.out.println(b);
		 }
		 

	}


}
