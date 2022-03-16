package com.assignments01;

public class BookArray {
	public BookArray(){
		
	}
	public void details(){
		Books[] bookarray=new Books[] {new Books("java","uday"),
                new Books("java 8.0","Agarval"),
                new Books("corejava ","arun"),
                new Books("python","daya"),
                new Books("advancedjava","varun")};
		
		for(Books book:bookarray){
			System.out.println(book);
			
		}
	}

}
