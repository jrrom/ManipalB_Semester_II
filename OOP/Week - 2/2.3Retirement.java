import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter birthday -");
		System.out.print("Day: ");
		int day = sc.nextInt();
		System.out.print("Month: ");
		int month = sc.nextInt();
		System.out.print("Year: ");
		int year = sc.nextInt() + 60;
		
		if (month > 12 || month < 1) {
			System.out.println("Invalid month.");
			System.exit(0);
		}
		
		if (month == 2) {
			if (year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0 ? true : false) : true) : false) {
				day = 29;
			} else {
				day = 28;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		} else {
			day = 31;
		}
		
		System.out.println();
		System.out.println("Retirement date -");
		System.out.println(day + "/" + month + "/" + year);
		
		sc.close();
	}

}
