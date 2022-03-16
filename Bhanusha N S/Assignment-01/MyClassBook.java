package com.assignments01;

public class MyClassBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassBook classbook=new ClassBook();
		ClassBook classbook1=new ClassBook(01, "Maths", "Ajay");
		ClassBook classbook2=new ClassBook(02, "Science", "Vijay");
		ClassBook classbook3=new ClassBook(03, "Social", "Sujay");
		ClassBook classbook4=new ClassBook(04, "Kannada", "jay");
		classbook.printbook();
		classbook1.printbook();
		classbook2.printbook();
		classbook3.printbook();
		classbook4.printbook();
	}

}
