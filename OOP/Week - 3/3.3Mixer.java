import java.util.Scanner;

class Mixer {
	int arr[];
	
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();
		this.arr = new int[n];
		
		System.out.println("Enter elements: ");
		for (int i = 0; i < n; i++) {
			this.arr[i] = sc.nextInt();
			if (this.arr[i] <= (/* todo */) {
				System.out.println("The array must be ascending order and cannot contain duplicates.");
				System.exit(1);
			}
		}
		
		sc.close();
	}
	
	public void display() {
		System.out.print("Array: [ ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}
	
	public Mixer mix(Mixer A) {
		Mixer result = new Mixer();
		int totalLength = A.arr.length + this.arr.length;
		
		result.arr = new int[totalLength];
		
		for (int i = 0; i < this.arr.length; i++) {
			result.arr[i] = this.arr[i];
		}
		
		for (int i = 0; i < A.arr.length; i++) {
			result.arr[i + this.arr.length] = A.arr[i]; 
		}
		
		for (int i = 0; i < result.arr.length; i++) {
			for (int j = i; j < result.arr.length - 1; j++) {
				if (result.arr[j + 1] < result.arr[j]) {
					int temp = result.arr[j + 1];
					result.arr[j + 1] = result.arr[j];
					result.arr[j] = temp;
				}
			}
		}
		
		
		
		return result;
	}
}

public class Main {
	public static void main(String[] args) {
		Mixer m1 = new Mixer();
		m1.accept();
		m1.display();
		Mixer m2 = new Mixer();
		m2.accept();
		m2.display();
		
		Mixer m3 = m1.mix(m2);
		m3.display();
	}
}
