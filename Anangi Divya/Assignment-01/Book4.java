package module;


public class Book{

public static void main(String[] args)  
{  
//create an array of Book4 object   
Book4[] obj = new Book4[5] ;  
//create & initialize actual Book4 objects using constructor  
obj[0] = new Book4(23907,"Dell");  
obj[1] = new Book4(91240,"HP");  
obj[2] = new Book4(29823,"LG");  
obj[3] = new Book4(11908,"MI");  
obj[4] = new Book4(43590,"King");  
//display the Book4 object data  
System.out.println("Book4 Object 1:");  
obj[0].m1();  
System.out.println("Book4 Object 2:");  
obj[1].m1();  
System.out.println("Book4 Object 3:");  
obj[2].m1();  
System.out.println("Book4 Object 4:");  
obj[3].m1();  
System.out.println("Book4 Object 5:");  
obj[4].m1();  
}  
}  
//Book4 class with Book4 Id and Book4 name as attributes  
class Book4  
{  
int book_Id;  
String book_name;  
//Book4 class constructor  
Book4(int bid, String bn)  
{  
book_Id = bid;  
book_name =bn;  
}  
public void m1()  
{  
System.out.print("Book4Id = "+book_Id + "  " + " book4Name = "+book_name);  
System.out.println();  
}  
}  