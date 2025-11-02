package bank;

public class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;
// if you create a constructoer wohic is not default the dfault one is not valid
    public Account(int accountNo,String accountHolderName,double balance,String accountType) {
        this.accountNumber = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }
}
