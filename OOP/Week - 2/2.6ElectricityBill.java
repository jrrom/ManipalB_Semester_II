import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter daily consumption for 7 days: ");
		double consumption = sc.nextDouble();
		switch ((int) consumption / 100) {
		case 0:
			System.out.println("The cost is: " + (consumption * 7));
			break;
		case 1:
			System.out.println("The cost is: " + (700 + (consumption - 100) * 8));
			break;
		default:
			System.out.println("The cost is: " + (1500 + (consumption - 200) * 10));
			break;
		}
		
		sc.close();
	}

}
