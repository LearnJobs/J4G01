package com.assignments02;

/**
 * 05.Implement the shallow cloning to create copy of existing book copy
 *
 */
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
		return "CopyBook [bookid=" + bookid + ", bookname=" + bookname + "]";
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	CopyBook book=new CopyBook(001,"JAVA");
	CopyBook book2=null;
	try {
		book2=(CopyBook)book.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("original :"+book);
	System.out.println("copy of book1 :"+book2);
	
	System.out.println("hash code of book1: "+book.hashCode());
	System.out.println("hash code of book1: "+book2.hashCode());
	
}



}
	