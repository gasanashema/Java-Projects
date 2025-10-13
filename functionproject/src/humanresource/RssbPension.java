package functionproject.src.humanresource;
import java.util.Scanner;
public class RssbPension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary;
        System.out.println("Enter The base salary");
        salary = sc.nextDouble();

        System.out.println(takeHomeAmount(salary));
        sc.close();
    }
    public static double pensionAmount(double basic_salary){
        return basic_salary*0.3;
    }
    public static double getRamaAmount(double basic_salary){
        return basic_salary*0.2;
    }
    public static double getMaternityAmount(double basic_salary){
        return basic_salary*0.1;
    }
    public static double takeHomeAmount(double base_salary){
        double p = pensionAmount(base_salary);
        double r = getRamaAmount(base_salary);
        double m = getRamaAmount(base_salary);

        return base_salary-p-r-m;
    }

    
}
