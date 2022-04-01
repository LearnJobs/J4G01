package com.assignment06;

import java.util.Scanner;

/**
 * main method of program no-01 and no-02
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                System.out.println("-------PROBLEM 01-------");
		 ProductTable01 producttable = new ProductTable01();
		 producttable.display_products();
		System.out.println("-------PROBLEM 02-------");
		Problem02 garments1 = new Problem02();
		garments1.display_garments("garments");

	}

}
