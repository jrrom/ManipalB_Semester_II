import java.util.Scanner;

class ShoppingCart {
	class Item {
		String itemName;
		int quantity;
		double price;
		
		Item(String itemName, int quantity, double price) {
			this.itemName = itemName;
			this.quantity = quantity;
			this.price = price;
		}
	}
	
	public Item[] cart;
	int top = 0;
	
	ShoppingCart(int n) {
		this.cart = new Item[n];
	}
	
	public void addItem(String itemName, int quantity, double price) {
		this.cart[top] = new Item(itemName, quantity, price);
		top++;
	}
	
	public double calculate() {
		double total = 0.0;
		
		for (Item item : cart) {
			total += item.price;
		}
		
		return total;
	}
	
	public void display() {
		System.out.println("======");
		System.out.println("Contents - ");
		System.out.println();
		for (Item item : cart) {
			System.out.println(item.itemName + "\t:\t" + item.quantity + "\tat\t" + item.price + " rupees");
		}
	}
}


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of items: ");
		int n = sc.nextInt();
		ShoppingCart shoppingCart = new ShoppingCart(n);
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Enter item - ");
			sc.nextLine();
			
			System.out.print("Enter name: ");
			String itemName = sc.nextLine();
			System.out.print("Enter quantity: ");
			int quantity = sc.nextInt();
			System.out.print("Enter price: ");
			double price = sc.nextDouble();
			
			shoppingCart.addItem(itemName, quantity, price);
		}
		
		System.out.println();
		shoppingCart.display();
		System.out.println("Total cost is " + shoppingCart.calculate());
		sc.close();
	}
}

/*
Enter number of items: 2

Enter item - 
Enter name: Pencil
Enter quantity: 5
Enter price: 5

Enter item - 
Enter name: Pen
Enter quantity: 5
Enter price: 10

======
Contents - 

Pencil	:	5	at	5.0 rupees
Pen	:	5	at	10.0 rupees
Total cost is 15.0
*/
