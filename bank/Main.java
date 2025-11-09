package bank;

import java.util.Scanner;

/**
 * the only reason of having an object is to allow sharing of futire(methods/variables between classes)
 * 
 */
public class Main {
    // three types of variables
    /*
        * instance variable: any variable declared inside a class without keyword static
        * class variable
        * local variable
    */ 
    public static void main(String[] args) {
        // to initialize an object we use a constructor
        // a constructor is a special method that is called when an object is created
        // it is having same name as a class name
        // it doesn't have a return type
        // if constructor brackets are empty means that is a default construct or
        Scanner sc = new Scanner(System.in);
        // int loanId;
        // double requestedAmount, approvedAmount;
        // System.out.println("Enter loan id: ");
        // loanId = sc.nextInt();
        // System.out.println("Enter requested amount: ");
        // requestedAmount = sc.nextDouble();
        // System.out.println("Enter approved amount: ");
        // approvedAmount = sc.nextDouble();
        // Loan loan = new Loan(loanId, requestedAmount, approvedAmount);
        // Deposit deposit = new Deposit(0, 0, 0);
        // Withdraw withdraw = new Withdraw(0, 0, 0);
        // Account account = new Account(0, null, 0, null);
        // encapsulation is nothing but hidding data
        // what ate data? : attributes, properties or it variables
        /*
         * your data has to be private
         * you have to create getter and setter
         */

        //  account.setAccountNumber(123);
        //  System.out.println(account.getAccountNumber());
        Withdraw withdraw = new Withdraw();
        int withdrawAmount;
        System.out.println("Enter withdraw amount: ");
        withdrawAmount = sc.nextInt();
        withdraw.setWithdrawAmount(withdrawAmount);
        withdraw.setBalance(1000000);
        withdraw.withdraw();
    }
}
