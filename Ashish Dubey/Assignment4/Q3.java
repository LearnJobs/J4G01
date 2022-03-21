package Assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Q3 
{
	
	public int id;
	public String name;
	public String author;
	public int price;
	
	Q3(int id, String str, String auth, int prc)
	{

	this.id=id;
	this.name=str;
	this.author=auth;
	this.price=prc;	
	}
	
	public static void main(String[] args)
	{
		
		Q3 obj0=new Q3(100,"Shoaib1","Ram1",1000);
		Q3 obj1=new Q3(100,"Shoaib2","Ram2",1100);
		Q3 obj2=new Q3(100,"Shoaib3","Ram3",1200);
		Q3 obj3=new Q3(100,"Shoaib4","Ram4",1300);
		
		ArrayList<String>List=new ArrayList<String>();
	
	System.out.println("value for Obj0 : "+obj0.id+" "+obj0.name+ " "+obj0.author+" "+" "+obj0.price);
	
	System.out.println("List After Sort:");
	System.out.println("List After Sorting the price");
}
}