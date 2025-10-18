public class BankAccount {

    private String accountHolder = "John Doe";
    private String accountNumber = "1232123243232";
    private float balance=1232.5f;
    private boolean isActive=false;
    private double loanAmount=122121;

    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String name){
        this.accountHolder = name;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String name){
        this.accountNumber = name;
    }
    public float getBalance(){
        return balance;
    }
    public void setBalance(float amount){
        this.balance = amount;
    }
    public boolean getIsActive(){
        return isActive;
    }
    public void setIsActive(boolean state){
        this.isActive = state;
    }
    public double getLoanAmount(){
        return loanAmount;
    }
    public void setLoanAmount(double amount){
        this.loanAmount = amount;
    }
}
