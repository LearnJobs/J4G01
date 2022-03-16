package com.module1Assignmnet;
public class SumAvg {
	
	static int sum=0;

	public static int sumNo(int[] numberArray) {
		
		for(int number:numberArray) {
			sum+=number;
		}
		
		return sum;}
	
	public static int avgNo(int[] numberArray) {
		
		for(int number:numberArray) {
			sum+=number;
		}
		
		return (sum/numberArray.length);}
	
}
