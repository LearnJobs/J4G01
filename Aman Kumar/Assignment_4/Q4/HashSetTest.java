package Q4;

import java.util.HashSet;

import Q1.Book;

public class HashSetTest {
	public static void main(String args[])
	{
		HashSet<Book> hS = new HashSet<Book>();
		hS.add(new Book(121,"Physic","HC Verma"));
		hS.add(new Book(123,"Data Structure","Alfred Aho"));
		hS.add(new Book(124,"computer network","Andrew S. Tanenbaum"));
		hS.add(new Book(125,"OOPs Concept"," REEMA THAREJA"));
		hS.add(new Book(126,"Chemistry","R.L Madan"));
		
		 for(Book h:hS)
		 {
			 System.out.println(h);
		 }
		 
	}

}
