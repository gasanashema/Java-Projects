package bank;

public class Account {
   private int accountNumber;
   private String accountHolderName;
   private double balance;
   private String accountType;
   /*
    * encapsulation: every data should be encapsulated to avoid direct access on data from outside

    * therefore we need two public methods. getter and setter
    1. get: return the value of the variable
    2. set: set the value of the variable
    */
// if you create a constructoer wohic is not default the dfault one is not valid
    public Account(int accountNo,String accountHolderName,double balance,String accountType) {
        this.accountNumber = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
