

		import java.util.ArrayList;
		import java.util.Comparator;
		import java.util.List;
		public class SortBook {

			public static void main(String[] args) {
				 List<BookArray> bookList = new ArrayList<BookArray>();
				 bookList.add(new BookArray(101,"Java ","A",880.0));
				 bookList.add(new BookArray(102,"Core Java","B",1000.0));
				 bookList.add(new BookArray(103,"python","C",1100.0));
				 bookList.add(new BookArray(104,"C","D",800.0));
				 bookList.add(new BookArray(105,"Full Stack","E",1500.0));
				 
				 bookList.sort(new Comparator<BookArray>() {
					 				@Override
					 				public int compare(BookArray book1, BookArray book2) {
					 						return book1.bookPrice.compareTo(book2.bookPrice);
					 			}
					 				});
				 System.out.println(bookList);

	             }
         }
