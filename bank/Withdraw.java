package bank;

public class Withdraw {
    private int withdrawId;
    private double withdrawAmount, balance;

    public void withdraw() {
        if(getWithdrawAmount()<5000){
            System.out.println("You can not withdraw less than 5000");
        }else if((getBalance()-getWithdrawAmount())<1000){
            System.out.println("Your balance is too low");
        }else{
            setBalance(getBalance()-getWithdrawAmount());
            System.out.println("Your new balance is "+getBalance());
        }
    }
    public int getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(int withdrawId) {
        this.withdrawId = withdrawId;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
