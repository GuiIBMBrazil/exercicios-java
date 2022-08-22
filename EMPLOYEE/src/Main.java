import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//importtando bibliotecas
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data:",i+1);

            System.out.printf("Outsourced (y/n)?");
            char value = sc.next().charAt(0);

            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours:");
            int hours = sc.nextInt();
            System.out.println("Value per hour:");
            double valuePerHour = sc.nextDouble();

            Employee employee = new Employee();

            switch (value){
                case 'y':
                    System.out.printf("Additional charge:");
                    double additionalCharge = sc.nextDouble();
                    employee = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
                    break;
                case 'n':
                    employee = new Employee(name,hours,valuePerHour);
                    break;
                default:
                    System.out.println("Type an valid additional charge:");
            }
            employees.add(employee);
        }
        for (Employee emp:employees) {
            System.out.println(emp.getName());
            System.out.println(emp.payment());
        }
    }
}
