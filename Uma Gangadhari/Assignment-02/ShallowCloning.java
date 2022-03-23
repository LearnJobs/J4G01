
public class ShallowCloning implements Cloneable{
int rollno;  
String name;    
 
ShallowCloning(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}


  
@Override
public String toString() {
	
	return rollno+","+name;
}



public static void main(String args[]){  
  
	ShallowCloning s1=new ShallowCloning(101,"uma");
	ShallowCloning s2=null;	
	
	try {
		s2 = (ShallowCloning)s1.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
  
System.out.println(s1);  
System.out.println(s2);  
  
}
}  
  