package Assignment5;

//Q : 8

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFromList {

  public static void main(String[] args) {
	  
     List<Integer> arrayList= Arrays.asList(1,2,3,4,5);
		List<Integer> arrayStored =  arrayList.stream()
			.map(a->(a*a))
				.collect(Collectors.toList());
				System.out.println(arrayStored);
			}

		}

