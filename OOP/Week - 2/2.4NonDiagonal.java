import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.print("Enter size of square array: ");
		size = sc.nextInt();
		
		int[][] square = new int[size][size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				square[i][j] = sc.nextInt();
			}
		}
		
		// To print out the non-diagonal elements
		System.out.println("The non-diagonal elements are: ");
		int sum = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i != j) {
					System.out.print(square[i][j] + " ");
					sum += square[i][j];
				}
			}
			System.out.println();
		}
		System.out.println("The sum is " + sum);
		
		sc.close();
	}

}
