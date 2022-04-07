

		import java.util.ArrayList;
		import java.util.Iterator;
		public class BookArrayList {

			public static void main(String[] args) {
				ArrayList<BookArray> bookList = new ArrayList<BookArray>();
				 bookList.add(new BookArray(101,"java","Ankur",890.0));
				 bookList.add(new BookArray(102,"Core Java","Samsundar",9900.0));
				 bookList.add(new BookArray(103,"Hibernet","Sampada",2500.0));
				 bookList.add(new BookArray(104,".Net","Samskruta",2900.0));
				 bookList.add(new BookArray(105,"Python","Haastha",3200.0));
				 
				 Iterator<BookArray> bookIterator= bookList.iterator();		
				 while(bookIterator.hasNext())					
					 System.out.println(bookIterator.next());		
			}

		}

