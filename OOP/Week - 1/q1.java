// To calculate salary for an employee of a company.

import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours worked: ");
        int hoursWorked = sc.nextInt();
        System.out.print("Enter hourly rate: ");
        int hourlyRate  = sc.nextInt();

        int salary;
        if (hoursWorked > 40) {
            salary = 40 * hourlyRate + ((hoursWorked - 40) * (hourlyRate / 2));
        } else {
            salary = hoursWorked * hourlyRate;
        }

        System.out.println("The salary is " + salary);
    }
}
