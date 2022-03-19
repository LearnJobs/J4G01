package Assignment2;

public class Q4 {

		int bookId;
		String bookName;

		public Q4(int bookId, String bookName) 
		{
			super();
			this.bookId = bookId;
			this.bookName = bookName;
		}

		public boolean equals(Object o) {
			Q4 e = (Q4) o;
			if (this.bookId == e.bookId && this.bookName.equals(e.bookName))
				return true;
			return false;
		}

		public static void main(String args[]) {
			Q4 e1 = new Q4(12, "math");
			Q4 e2 = new Q4(12, "math");

			if (e1.equals(e2)) {
				System.out.println("Object are equal");
			} else {
				System.out.println("objects are not equal");
			}
		}

	}


