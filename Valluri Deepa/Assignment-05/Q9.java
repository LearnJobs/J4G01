import java.util.Arrays;
import java.util.List;

public class Q9 {
	public static void main(String[] args) {
		List<Integer> arrayList= Arrays.asList(10,30,60,70,90,80,50,40,20);
		int no =arrayList.stream().filter(n->(n>20)).findFirst().orElse(null);
		System.out.println(no);
	}
}
