

		public class BookCompare implements Comparable<BookCompare> {

			String firstName;
			String lastName;

			public BookCompare(String x, String y) {
				this.firstName = x;
				this.lastName = y;
			}

			public String toString() {
				return  firstName + " , " + lastName ;
			}

			@Override
			public int compareTo(BookCompare a) {
				// if the string are not equal
				if (this.firstName.compareTo(a.firstName) != 0) {
					return this.firstName.compareTo(a.firstName);
				} else {
					// we compare lastName if firstNames are equal
					return this.lastName.compareTo(a.lastName);
				}
			}
}
