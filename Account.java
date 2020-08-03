
public abstract class Account {
// Variables to be used in this class
    String accountID;
    double balance;
    double rate;
    int numberOfChecksUsed;
// difining abstract classes to be implemented in each class
    abstract boolean withdraw(double amount);
    abstract void deposit(double amount);
// the constructor for the Account class that also sets balance and account id and the add each account to the array lsit
    public Account(){
        System.out.println("Account was made");
    }

    public Account(String a, double b ){
        accountID = a;
        balance = b;
        Bank.listOfAccounts.add(this);
    }
// to string method to output key metrics 
    @Override
    public String toString(){
        String message = "Account:" + accountID + "," + "Balance =" + balance + "Intreast" + rate + "Number of checks"+ numberOfChecksUsed;
       return message; 


       

     }}


     



