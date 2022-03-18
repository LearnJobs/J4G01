
public class Arraybook {
	 public static void main(String args[])
	    {
	  
	        
	        Student[] arr;
	  
	        
	        arr = new Student[2];
	  
	        
	        arr[0] = new Student(1701289270, "Satyabrata");
	  
	        
	        arr[1] = new Student(1701289219, "Omm Prasad");
	  
	       
	        System.out.println(
	            "Student data in student arr 0: ");
	        arr[0].display();
	  
	        System.out.println(
	            "Student data in student arr 1: ");
	        arr[1].display();
	    }
	}
	  
	
	class Student {
	  
	    public int id;
	    public String name;
	  
	    
	    Student(int id, String name)
	    {
	        this.id = id;
	        this.name = name;
	    }
	  
	    
	    public void display()
	    {
	        System.out.println("Student id is: " + id + " "
	                           + "and Student name is: "
	                           + name);
	        System.out.println();
	    }
	}




