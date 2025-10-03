package codewars;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year is divisible by 4, but not divisible by 100 unless also divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // It's a leap year
        } else {
            return false; // It's not a leap year
        }
    }
}
