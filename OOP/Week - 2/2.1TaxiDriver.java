import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cost of the trip: ");
		double cost = sc.nextDouble();
		double distance = 0;
        if (cost > 295) {
        	System.out.println("Undefined");
        }
        
        if (cost <= 50) {
        	distance = cost / 10;
        } else if (cost <= 170) {
        	distance = 5 + ((cost - 50) / 8);
        } else {
        	distance = 20 + ((cost - 170) / 5);
        }
        
        System.out.println("The distance is " + distance + " km");
        
        sc.close();
	}

}
