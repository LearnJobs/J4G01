package Assignment5;

		import java.util.ArrayList;
		import java.util.function.Consumer;

		public class SqArrayList {

			public static void main(String[] args) {
				ArrayList<Integer> numberList = new ArrayList<Integer>();
				for(int i=1;i<=10;i++)
					numberList.add(i);
				Consumer<Integer> squareNumbers =(n)->System.out.print(n*n+" ");
				for(Integer number : numberList)
					squareNumbers.accept(number);		

	}

}
