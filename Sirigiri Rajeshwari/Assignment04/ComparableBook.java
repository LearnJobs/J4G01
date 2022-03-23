
		import java.util.Arrays;

		public class ComparableBook {

			public static void main(String[] args) {

				BookCompare[] bookarray1 = new BookCompare[] {
						new BookCompare("abc", "a"),
						new BookCompare("bcd", "b"),
						new BookCompare("cde", "c"),
						new BookCompare("def", "d"),
						new BookCompare("efg", "e") };

				// Sorting the array
				Arrays.sort(bookarray1);

				// Pair array
				print(bookarray1);
			}

			public static void print(BookCompare[] bookarray1) {
				for (int i = 0; i < bookarray1.length; i++) {
					System.out.println(bookarray1[i]);
				}
			}
	}

