package functionproject.src.humanresource;

import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary;
        System.out.println("Enter the salary: ");
        salary = sc.nextDouble();

        System.out.println("The net salary after deducting taxes = "+ getBalance(salary));
        sc.close();
    }
    public static double getVat(double salary){
        return salary*0.018;
    }
    public static double getIncomeTax(double salary){
        return salary*0.03;
    }
    public static double getExerciseDuty(double salary){
        return salary*0.02;
    }
    public static double getBalance(double salary){
        double vat = getVat(salary);
        double incomeTax = getIncomeTax(salary);
        double exerciseDuty = getExerciseDuty(salary);
        double balance = salary - vat - incomeTax - exerciseDuty;
        return balance;
    }
    
}
