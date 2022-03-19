package Assignment2;

public class Q5 implements Cloneable
{

		int bookPrice;
		String bookName;

		public Q5 (String bookName, int bookPrice) {
			this.bookName = bookName;
			this.bookPrice = bookPrice;
		}

		@Override
		public String toString() {
			return "bookPrice = " + bookPrice + ", bookName = " + bookName;
		}

		public static void main(String[] args) {
			Q5 book1 = new Q5("Java", 360);
			Q5 book2 = null;
			try {
				book2 = (Q5) book1.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}

			System.out.println("Content of book 1 : " + book1);
			System.out.println("Content of book 2 : " + book2);

			System.out.println("hash of book 1 : " + book1.hashCode());
			System.out.println("hash of book 2 : " + book2.hashCode());
		}

	}




