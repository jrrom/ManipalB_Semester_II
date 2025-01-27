import java.util.Scanner;
public class Main {
	private static int factorial(int num) {
		if (num == 1) return 1;
		return num * factorial(num - 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number to find factorial of: ");
		int num = sc.nextInt();
		if (num <= 0) {
			System.out.println("Negative value not permitted");
			System.exit(0);
		}
		
		System.out.println("The factorial is " + factorial(num));
		
		sc.close();
	}
}
