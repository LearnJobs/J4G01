import java.util.ArrayList;
import java.util.Collections;


class Question_03 {
	public static void main(String[] args)
	{

	
		ArrayList<Bookk> al = new ArrayList<>();

		al.add(new Bookk(123,"Java","JamesGosling",5000));
		al.add(new Bookk(345,"C","Dennis",3000));
		al.add(new Bookk(478,"C++","Strotsup",7000));
		al.add(new Bookk(443,"Python","Dussein",10000));
		al.add(new Bookk(389,"Ruby","RubyBoy",7989));

		Collections.sort(al);
		
		System.out.println("After sort elements in ascending order : ");
		for(Bookk t:al)
		System.out.println( t.price);
	}
}
