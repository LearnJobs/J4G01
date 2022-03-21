package Assignment4;

import java.util.*;
class Book
{
int id;
String name;
String author;
public Book(int id,String name,String author)
{
	this.id=id;
	this.name=name;
	this.author=author;
}
public Book(String string, int i) {
	// TODO Auto-generated constructor stub
}
}
 public class Q4
 {
	 public static void main(String[] args)
	 {
		 HashSet<Book>set=new HashSet<Book>();
		 Book b1=new Book(101,"Ashish","123");
		 Book b2=new Book(102,"Aman","314");
		 Book b3=new Book(103,"Alok","219");
		 
		 set.add(b1);
		 set.add(b2);
		 set.add(b3);
		 for(Book b:set)
		 {
			 System.out.println(b.id+" "+b.name+" "+b.author);
		 }
	 }
 }