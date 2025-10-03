import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id, age;
        String name, address;
        System.out.println("Id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("name: ");
        name = sc.nextLine();
        System.out.println("age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("address: ");
        address = sc.nextLine();
        System.out.println("My names are "+name+" I'm "+age+" years My id is: "+ id+" I live at "+address);
        sc.close();
    }
}
