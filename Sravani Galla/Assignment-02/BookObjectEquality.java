package com.string;

public class BookObjectEquality {
	int bookId;     //integer
	String bookName;
		 public BookObjectEquality (int bookId,String bookName){
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		 }
		public static void main(String[] args) {
			BookObjectEquality b1 = new BookObjectEquality(25,"Sravani");
			BookObjectEquality b2 = new BookObjectEquality(25,"Sravani");
			if(b1.equals(b2)) {
				System.out.println("objects are equals");
			}
				else {
					System.out.println("objects are not equals");
			}


		}
		 }
