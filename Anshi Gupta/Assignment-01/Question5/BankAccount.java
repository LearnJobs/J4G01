class BankAccount
{
    int accountId ,accoumtBalance;
    String accountName;
    public BankAccount(int accountId,String accountName,int accoumtBalance)
    {
        this.accountId=accountId;
        this.accountName=accountName;
        this.accoumtBalance=accoumtBalance;
    }
    public void deposit(int amt)
    {
        System.out.println("balance in a account:"+accoumtBalance);
        
        amt = accoumtBalance + amt;
        System.out.println( +accountId+"   "+accountName+"   "+amt );
    }  
    public void withdraw(int amt)
    {
        System.out.println("balance in a account:"+accoumtBalance);
        amt = accoumtBalance - amt;
        System.out.println(accountId+"  "+accountName+"  "+amt);
    }  
  
}
