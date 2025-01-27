import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the registration number: ");
		String rNumber = String.valueOf(sc.nextInt());
		int digits = rNumber.length();
		if (digits != 9) {
			System.out.println("Invalid registration number.");
		} else {
			System.out.println("The year of joining is 20" + rNumber.charAt(0) + rNumber.charAt(1));
		}
		
		sc.close();
	}

}
