
public class ShallowCloning implements Cloneable{
int rollno;  
String name;    
 
ShallowCloning(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}

public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  

  
public static void main(String args[]){  
try{  
	ShallowCloning s1=new ShallowCloning(101,"uma");  
  
	ShallowCloning s2=(ShallowCloning)s1.clone();  
  
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  