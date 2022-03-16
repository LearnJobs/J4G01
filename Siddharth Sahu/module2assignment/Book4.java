package com.module2assignment;
//   4. Check the equality of Book object using
//equals() method.


public class Book4 {
	
	int bookPrice;
	String bookName;
	
	public Book4(String bookName,int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	public void ObjEqual(Book4 book1,Book4 book2) {
		if(book1.equals(book2))
			System.out.println("book objects are equal");		
		else
			System.out.println("book objects are not equal");
	}

	@Override
	public boolean equals(Object obj) {
		Book4 b = (Book4)obj;
		if(this.bookPrice == b.bookPrice && this.bookName.equals(b.bookName)) 
			return true;
		return false;
	}
	
	
}
