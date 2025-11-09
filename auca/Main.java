package auca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the campus ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the campus address: ");
        String gishushuAddress = sc.nextLine();
        System.out.println("Enter the campus phone: ");
        String gishushuPhone = sc.nextLine();
        System.out.println("Enter the campus email: ");
        String gishushuEmail = sc.nextLine();
        System.out.println("Enter the faculty ID: ");
        int facultyId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the faculty name: ");
        String facultyName = sc.nextLine();
        System.out.println("Enter the department ID: ");
        int deptId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the department name: ");
        String deptName = sc.nextLine();
        System.out.println("Enter the student name: ");
        String studentName = sc.nextLine();
        System.out.println("Enter the student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the student address: ");
        String studentAddress = sc.nextLine();
        System.out.println("Enter the student phone: ");
        String studentPhone = sc.nextLine();
        System.out.println("Enter the student email: ");
        String studentEmail = sc.nextLine();
        System.out.println("Enter the major: ");
        String major = sc.nextLine();

        Student student = new Student(id, gishushuAddress, gishushuPhone, gishushuEmail, facultyId, facultyName, deptId, deptName, studentName, studentId, studentAddress, studentPhone, studentEmail, major);
        
    }
}
