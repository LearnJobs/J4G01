
public class CopyBook implements Cloneable {
	int bookid;
	String bookname;
	public CopyBook(int bookid, String bookname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
	}
      @Override
      public String toString() {
    	  return "CopyBook [bookid =" + bookid + ", bookname = "+bookname + "]";
      };
	public static void main(String[] args) {
		CopyBook book = new CopyBook(101, "java");
		CopyBook book1 = null;
		try {
			book1 = (CopyBook)book.clone();
		}
			catch(CloneNotSupportedException e) {
				e.printStackTrace();
			}
			System.out.println("Original :"+book);
			System.out.println("copy of book1 :"+book1);
			System.out.println("hash code of book1: "+ book.hashCode());
			System.out.println("hash code of book1 :"+ book1.hashCode());
		}
		
	}


