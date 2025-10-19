public class Main {
    static BankAccount account = new BankAccount();
    public static void main(String[] args) {
        account.setIsActive(true);
        System.out.println("Account status activated");
        
    }
    public static void deposit(float amount){
        boolean accountStatus = account.getIsActive();
        if (!accountStatus || amount<100) {
            System.out.println("Account not active");
            return;
        }

        float accountBalance = account.getBalance();
        account.setBalance(accountBalance+amount);
        System.out.println("Deposit Successful, Your new balance is " + accountBalance + amount);
    }
    public static void withdraw(float amount){
        if (amount<20000000) {
            
        }
    }
   
    
}
