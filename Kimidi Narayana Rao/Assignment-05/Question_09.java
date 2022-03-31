
import java.util.Arrays;
import java.util.List;

public class Question_09 {

	public static void main(String[] args)
	{
		List<Integer> ar= Arrays.asList(10,20,30,40,25,16,7,18,39,10);
		
		int num =ar.stream().filter(n->(n>20)).findFirst().orElse(null);
		
		System.out.println(num);
	}
}