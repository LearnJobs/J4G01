package com.Assignment05;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FunctionalInterface04  {
	

	
		public static void main(String[] args) {
			ArrayList<Integer> numberList = new ArrayList<Integer>();
			for(int i=1;i<=10;i++)		
				numberList.add(i);
			Consumer<Integer> squareNumbers =(n)->System.out.print(n*n+" ");			
			System.out.println("Printing square of numbers from 1 to 10 by Consumer");
			for(Integer number : numberList)
				squareNumbers.accept(number);			
		}
		
	}
	


