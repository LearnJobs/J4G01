package conn.hashsett;

import java.util.HashSet;

public class QuestionMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> hS = new HashSet<Book>();
		hS.add(new Book(101,"Physic","HC Verma"));
		hS.add(new Book(102,"Data Structure","Alfred Aho"));
		hS.add(new Book(103,"computer network","Andrew S. Tanenbaum"));
		hS.add(new Book(104,"OOPs Concept"," REEMA THAREJA"));
		hS.add(new Book(105,"Chemistry","R.L Madan"));
		
		 for(Book h:hS)
		 {
			 System.out.println(h);
		 }

	}

}
