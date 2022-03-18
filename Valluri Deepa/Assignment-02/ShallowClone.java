//module2-5
public class ShallowClone implements Cloneable {
	int bookid;
	String bookname;
	public ShallowClone(int bookid, String bookname) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
	}
	public String toString() {
		return "ShallowClone [bookid=" + bookid + ", bookname=" + bookname +  "]"; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShallowClone book=new ShallowClone(001, "MYLIFE");
		ShallowClone book2=null;
   try {
	   book2=(ShallowClone)book.clone();
	   } catch (CloneNotSupportedException e) {
		   e.printStackTrace();
	   }
   System.out.println("original :"+book);
   System.out.println("copy of book1 : "+book2);
   
   System.out.println("hash code of book1: "+book.hashCode());
   System.out.println("hash code of book1: "+book2.hashCode());


	}

}
