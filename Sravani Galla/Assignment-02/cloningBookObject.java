package com.string;

public class cloningBookObject {
	int bookId;
	String bookName;
	public cloningBookObject(int bookId,String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	
	}
	public String toString() {
		return bookId+" , "+bookName;
		public static void main(String[]args) {
			BookObject b1 = new BookObject(25,"Sravani");
			BookObject b2 = null;
			b2=b1;
			System.out.println("content of b1 :"+b1);
			System.out.println("content of b2 :"+b2);

			System.out.println("hash of b1:"+b1.hashcode());
			System.out.println("hash of b2:"+b2.hashcode());
			
			
			
		}
	}

}
