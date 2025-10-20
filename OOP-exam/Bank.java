import java.util.Scanner;

public class Bank {
    public static String accountHolderName = null;
    public static String accountNumber;
    public static double balance;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        System.out.println("Welcome to Bank Management System:");
        // System.out.println(
        // "1. Create Account \n 2. Deposit \n 3. Withdraw \n 4. Check Balance \n 5.
        // Transfer Funds \n 6. Calculate Interest \n 7. Display Account Info \n 8.
        // Apply Fee \n 9. Transaction History \n 10. Close Account");

        // choice = sc.nextInt();
        do {

            System.out.println(
                    "\n\n Enter your choice: \n 1. Create Account \n 2. Deposit \n 3. Withdraw \n 4. Check Balance \n 5. Transfer Funds \n 6. Calculate Interest \n 7. Display Account Info \n 8. Apply Fee \n 9. Transaction History \n 10. Close Account \n :");

            choice = sc.nextInt();
            sc.nextLine();
            if (choice != 1 && accountHolderName == null) {
                System.out.println(">>>>> Please Create account first");
            } else {
                switch (choice) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        double depositAmount;
                        System.out.println("Enter Deposit amount: ");
                        depositAmount = sc.nextDouble();
                        deposit(depositAmount);
                        break;

                    case 3:
                        double withdrawAmount;
                        System.out.println("Enter Withdraw amount: ");
                        withdrawAmount = sc.nextDouble();
                        withdraw(withdrawAmount);
                        break;
                    case 4:
                        checkBalance();
                        break;
                    case 5:
                        double transferAmount;
                        String recieverAcc;
                        System.out.println("Enter receiver account: ");
                        recieverAcc = sc.nextLine();
                        System.out.println("Enter Transfer amount: ");
                        transferAmount = sc.nextDouble();
                        transferFunds(recieverAcc, transferAmount);
                        break;

                    case 6:
                        calculateInterest();
                        break;
                    case 7:
                        displayAccountInfo();
                        break;
                    case 8:
                        applyFee();
                        break;
                    case 9:
                        System.out.println(">>>>> Not Implemented");
                        break;
                    case 10:
                        int closeAcc = closeAccount();
                        if (closeAcc == 1) {
                            choice = 0;
                        } else {
                        }
                        break;
                    default:
                        System.out.println(">>>>> Enter a valid choice: ");
                        break;
                }
            }

        } while (choice != 0);

    }

    public static void createAccount() {
        String name, accountNo;
        double initialAmount;
        System.out.println("Names: ");
        name = sc.nextLine();
        System.out.println("Enter Account Number: ");
        accountNo = sc.nextLine();
        System.out.println("Enter Initial Deposit:");
        initialAmount = sc.nextDouble();
        while (initialAmount < 0) {
            System.out.println("Enter amount greater than 0: ");
            initialAmount = sc.nextDouble();
        }

        accountHolderName = name;
        accountNumber = accountNo;
        balance = initialAmount;

        System.out.println(">>>>> Account Creation successful");
    }

    public static void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error!! Deposit amount must be greater than 0");
        } else {
            balance += amount;
            System.out.println(">>>>> Deposit successful! Your new balance is " + balance);
        }

    }

    public static void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(">>>>> Insufficient balance");
        } else {
            balance -= amount;
            System.out.println(">>>>> Withdraw successful! Your new balance is " + balance);
        }
    }

    public static void checkBalance() {
        System.out.println("Your current account balance is " + balance);
    }

    public static void transferFunds(String receiverAccount, double amount) {
        if (amount < 0) {
            System.out.println(">>>>> Transfer amount should not be 0");
        } else if (amount > balance) {
            System.out.println(">>>>> Insufficient balance");
        } else {
            balance -= amount;
            System.out.println(">>>>> Transfer successful! Your new balance is " + balance);
        }
    }

    // fix the interest rate
    public static void calculateInterest() {
        double totalInterest = (balance * 5)/ 100;
        balance += totalInterest;
        System.out.println("Using the interest rate of 5% Your interest is " + totalInterest
                + " And your new balance is " + balance);
    }

    public static void displayAccountInfo() {
        System.out.println("Account info: \n -------------------------\n Account Holder: " + accountHolderName);
        System.out.println("\n Account Number: " + accountNumber);
        System.out.println("\n Current Balance: " + balance);
    }

    public static void applyFee() {
        double serviceFee = 500;
        balance -= serviceFee;
        System.out.println(">>>>> The fee is 500 and Your New Balance is: " + balance);
    }

    public static void transactionHistory() {

    }

    public static int closeAccount() {
        int answer;
        System.out.println("Are you sure you want to close account? \n 1. Yes \n 2.No \n ");
        answer = sc.nextInt();
        switch (answer) {
            case 1:
                accountHolderName = null;
                accountNumber = null;
                balance = 0;
                System.out.println(">>>>> Account Closed successfuly");
                return 1;
            case 2:
                return 2;

            default:
                System.out.println(">>>>> invalid input");
                return 2;
        }

    }
}
