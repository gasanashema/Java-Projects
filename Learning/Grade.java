import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        int grade = marks > 90 ? 1 : (marks > 80 ? 2 : (marks > 70 ? 3 : (marks > 60 ? 4 : 5)));
        
        switch (grade) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
        }
    }
}