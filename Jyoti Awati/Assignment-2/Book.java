

public class Book {
    int bId;
    String bName;

   public Book(int bId , String bName) {
   	this.bId = bId;
    	this.bName =bName;
    }
   public boolean equals(Object o) {
    	Book b = (Book)o;
    	if(this.bId == b.bId && this.bName.equals(b.bName))
    	return true;
    	return false;
    }
	public static void main(String[] args) {
		Book b1 = new Book(101, "ABC");
		Book b2 = new Book(102, "PQR");
		if(b1.equals(b2)) 
		  System.out.println("Objects are equals");
          else
		      System.out.println("Objects are not equals");
		}

	}


