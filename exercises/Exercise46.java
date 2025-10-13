import java.util.Scanner;

public class Exercise46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1, num2, result=0;
        String opp;
        System.out.println("Enter first Num: ");
        num1 = sc.nextFloat();
        System.out.println("Enter second Num: ");
        num2 = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Opertor: ");
        opp = sc.nextLine();
        switch (opp) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 + num2;
                break;
            case "%":
                result = num1 + num2;
                break;

            default:
                System.out.println("Invalid opperator");
                break;
        }

        System.out.println(result);
        sc.close();
    }

}
