package Used;

import java.util.*;
class Book
{
	//here i take diff.type variable like int & string
int id;
String name;
String author;
public Book(int id,String name,String author)//here i create a parameterized constructor
{
	//here i m using the this method
	this.id=id;
	this.name=name;
	this.author=author;
}
}
 public class Prob4//here i create one class
 {
	 public static void main(String[] args)//this is the main method
	 {
		 HashSet<Book>set=new HashSet<Book>();//here i m using the hastset
		 //here i create 3 diff.obj.
		 Book b1=new Book(101,"Ram","Xyz");
		 Book b2=new Book(102,"sam","abc");
		 Book b3=new Book(103,"jam","def");
		 //here i m using the set method
		 set.add(b1);
		 set.add(b2);
		 set.add(b3);
		 for(Book b:set)//here i m using the for condition
		 {
			 System.out.println(b.id+" "+b.name+" "+b.author);//to print the values
		 }
	 }
 }
