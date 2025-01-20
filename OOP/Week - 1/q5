// Program to manage inventory
import java.util.Scanner;
public class Main {
	public static class Product {
		public int quantity;
		public double price;
		public String name;

		public Product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of products to create: ");
		int num = sc.nextInt();
		sc.nextLine();
		Product[] products = new Product[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter information for the product");
			System.out.print("Enter name: ");
			String name = sc.nextLine();
			System.out.print("Enter price: ");
			double price = sc.nextDouble();
			System.out.print("Enter amount to purchase: ");
			int quantity = sc.nextInt();
			products[i] = new Product(name, price, quantity);
			sc.nextLine();
			System.out.println();
		}
		
		double total = 0;
		for (Product product : products) {
			total += product.quantity * product.price;
		}
		System.out.println("You spent " + total);
	}

}
