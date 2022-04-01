package Assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookClassWithAttributes3
{
	
	public int id;
	public String name;
	public String author;
	public int price;
	
	 BookClassWithAttributes3(int id, String str, String auth, int prc)
	{

	this.id=id;
	this.name=str;
	this.author=auth;
	this.price=prc;	
	}
	
	public static void main(String[] args)
	{
		
		 BookClassWithAttributes3 obj0=new  BookClassWithAttributes3(100,"Sravani1","aaa",100);
		 BookClassWithAttributes3 obj1=new  BookClassWithAttributes3(100,"Sravani2","bbb",100);
		 BookClassWithAttributes3 obj2=new  BookClassWithAttributes3(100,"Sravani3","ccc",1250);
		 BookClassWithAttributes3 obj3=new  BookClassWithAttributes3(100,"Sravani4","ddd",1300);
		
		ArrayList<String>List=new ArrayList<String>();
	
	System.out.println("value  : "+obj0.id+" "+obj0.name+ " "+obj0.author+" "+" "+obj0.price);
	
	System.out.println("List After Sort:");
	System.out.println("List After Sorting the price");
}
}