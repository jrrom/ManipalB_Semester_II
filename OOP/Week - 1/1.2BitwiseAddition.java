// To add two numbers together using bitwise operations

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        while (n2 != 0) {
            int carry = n1 & n2;
            n1 = n1 ^ n2;
            n2 = carry << 1;
        }

        if ((n1 ^ 1) == (n1 + 1)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        int sum = n1;

        System.out.println("The sum is " + sum);
        sc.close();
    }
}
