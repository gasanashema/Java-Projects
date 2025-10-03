package codewars;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width;

        // Display the result
        System.out.println("The area of the rectangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
