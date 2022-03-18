package Used;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>//here i create a one class
{  
	//here i m using diff.types of variables 
int rollno;  
String name;  
int age;  
Student(int rollno,String name,int age)//here i m using the parameterized constructor
{
	//here i m using the this keyword
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  

public int compareTo(Student st)//here i m using the compare to method
{
if(age==st.age) //here i m using the if condition 
return 0;  
else if(age>st.age) //here i m using the if else cond. 
return 1;  
else  //here i m using the else cond.
return -1;  
}  
public static class TestSort1//here i create a testSort class
{  
	public static void main(String args[])//this is the main method for the main method
	{  
		  
	ArrayList<Student> al=new ArrayList<Student>(); //here i create a one array list
	
		//here i take two student details
		al.add(new Student(106,"Anil",27));  
		al.add(new Student(105,"Jam",21));  
		  
		Collections.sort(al);  //here i m using the collections
		for(Student st:al)//here i m using the foreach loop 
		{  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  //to print the stmt
		}  
	}
}
}


