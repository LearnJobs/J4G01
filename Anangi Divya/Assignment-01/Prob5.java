package Com.Strings;

public class Prob5 
{
	public static class BankAccount {  //We create a class and class name is bankaccount
		
		//these are the instance variables of global variable
		
	   static int accountId;//here we take accountid of int variable type 
		
		static String accountName;//here we take accountname of string variable type
		 
		static double accountBalance;//here we take accountbalance of double variable type
		
		public BankAccount(int accountId , String accountName,double accountBalance)//here we take one constructor type of bankaccount type
		{
			this.accountId=accountId;//this is a keyword and it refers to current object in a method or constructor of account id
			
			this.accountName=accountName;//this is a keyword and it refers to current object in a method or constructor of account name
			
			this.accountBalance=accountBalance;//this is a keyword and it refers to current object in a method or constructor of accountbalance	
		}
		public BankAccount(double d)// here we create a one type of constructor is known as bankaccount type
		{
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) //this is the main method of bankaccount
		{	
			BankAccount Balance=new BankAccount(40000.00);//here we create constructor for the bankaccount of balance
			Object bal = 0;// here we take object type of bal
			((BankAccount) bal).add(500);
			BankAccount Balance1=new BankAccount(2000.00);//here we create constructor for the bankaccount of balance1
			((BankAccount) bal).add(400);
			double account;
			System.out.println("Id:"+accountId);// print the account id
			
			System.out.println("Name:"+accountName);//print the account name
			
			System.out.println("bal:"+accountBalance);//print the account balance
		}
		public void add(double amt)// here we create a one type of constructor is known as add type
		{
			
			double account;
			accountBalance=accountBalance+amt;//here we adding the amount to the account balance
		}
		public void withdraw(double amt)// here we create a one type of constructor is known as withdraw type
		{
			this.accountBalance=amt;//here we withdraw the amount
		}
		}
}
