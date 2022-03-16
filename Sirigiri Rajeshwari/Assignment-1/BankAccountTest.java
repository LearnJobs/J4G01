import java.util.Scanner;

public class BankAccountTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int amt = 0;
       BankAccount ba = new BankAccount(5, "Samskruta");
       ba.displayDetails();
       ba.deposite(500);
       System.out.println("Enter Amount :");
       amt = sc.nextInt();
       if(amt<=0) {
    	   System.out.println("Invalid Balance :");}
    	   else
    		   ba.withdraw(amt);
       }
	}

