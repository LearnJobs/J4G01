package module;

public class Bank {
	public static class BankAccount{
		static int accountId;
		static String accountName;
		static double accountBalance;
		public BankAccount(int accountId ,String accountName,double accountBalance)
		{
			this.accountId=accountId;
			this.accountName=accountName;
			this.accountBalance=accountBalance;
		}
		public BankAccount(double d)
		{
			
		}
		public static void main(String[]args) {
			BankAccount Balance = new BankAccount(40000.00);
			Object bal = 0;
			((BankAccount) bal).add(500);
			BankAccount Balance1 = new BankAccount(2000.00);
			((BankAccount) bal) .add(400);
			double account;
			System.out.println("Id:"+accountId);
			System.out.println("Name:"+accountName);
			System.out.println("bal:"+accountBalance);
		}
		public void add(double amt) {
			double account;
            accountBalance=accountBalance+amt;
		}
		public void withdraw(double amt)
		{
			this.accountBalance=amt;
		}

	}



	}


