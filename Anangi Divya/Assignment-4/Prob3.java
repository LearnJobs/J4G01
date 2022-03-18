package Used;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Prob3 
{
	//here im using the public variables of diff. types of data types 
	public int id;
	public String name;
	public String author;
	public int price;
	//here i create a one parameterized constructor
	Prob3(int id, String str, String auth, int prc)
	{
		//here i m using the this method for diff. data types
	this.id=id;
	this.name=str;
	this.author=auth;
	this.price=prc;	
	}
	
	public static void main(String[] args)//this is the main method of the class
	{
		//here i create 4 diff. obj.
		Prob3 obj0=new Prob3(100,"ravi1","sam1",2000);
		Prob3 obj1=new Prob3(100,"ravi2","sam2",2100);
		Prob3 obj2=new Prob3(100,"ravi3","sam3",2200);
		Prob3 obj3=new Prob3(100,"ravi4","sam4",2300);
		
		ArrayList<String>List=new ArrayList<String>();//here i m using the array list
	//here to print the value of obj0. only because i want to print only obj0
	System.out.println("value for Obj0 : "+obj0.id+" "+obj0.name+ " "+obj0.author+" "+" "+obj0.price);
	//Collections.sort(Listint,ListString,Liststring,Listint);
	System.out.println("List After Sort:");
	System.out.println("List After Sorting the price");
}
}