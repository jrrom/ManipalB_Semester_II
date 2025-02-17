class Counter {
	static private int count = 0;
	
	Counter() {
		this.count++;
	}
	
	static void showCount() {
		System.out.println("The current count is: " + count);
	}
}

public class Main {

	public static void main(String[] args) {
		Counter.showCount();
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter.showCount();

	}

}

/*
The current count is: 0
The current count is: 3
*/
