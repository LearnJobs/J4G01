package Assignment1;

public class Q5 
    {
     int accountId;
     String accountName;
     double accountBalance;
     double sumBalance;
	
     
     public void BankAccount(int accountId, String accountName, double accountBalance) 
     {
    	 this.accountId = accountId;
    	 this.accountName = accountName;
    	 this.accountBalance = accountBalance;
    	 
     }
     public static void main (String [] args) 
     {
    	 Q5 ba1 = new Q5 ();
    	 ba1.add(500);
    	 System.out.println("ID: "+ba1.accountId);
    	 System.out.println("Name: "+ba1.accountName);
    	 System.out.println("Balance: "+ba1.accountBalance);
    	 
    	 System.out.println();
    	 
    	 ba1.withdraw(1000);
    	 System.out.println("ID: "+ba1.accountId);
    	 System.out.println("Name: "+ba1.accountName);
    	 System.out.println("Balance: "+ba1.accountBalance);

       }
     public void add (double amt)
     {
    	 accountBalance  = accountBalance + amt;
     }
     public void withdraw (double amt) 
     {
    	 this.accountBalance -=amt;
     }

} 