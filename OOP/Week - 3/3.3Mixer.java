import java.util.Arrays;
import java.util.Scanner;

class Mixer {
    int arr[];

    public void accept(Scanner sc) {
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        this.arr = new int[n];

        System.out.println("Enter elements in ascending order (no duplicates): ");
        for (int i = 0; i < n; i++) {
            this.arr[i] = sc.nextInt();
            if (i > 0 && this.arr[i] <= this.arr[i - 1]) {
                System.out.println("The array must be in ascending order and contain no duplicates.");
                System.exit(1);
            }
        }
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
        int totalLength = this.arr.length + A.arr.length;
        result.arr = new int[totalLength];

        int i = 0, j = 0, k = 0;
        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j]) {
                result.arr[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                result.arr[k++] = A.arr[j++];
            } else {  // Equal elements, add only one and skip both
                result.arr[k++] = this.arr[i++];
                j++;
            }
        }

        // Copy remaining elements from this.arr
        while (i < this.arr.length) {
            result.arr[k++] = this.arr[i++];
        }

        // Copy remaining elements from A.arr
        while (j < A.arr.length) {
            result.arr[k++] = A.arr[j++];
        }

        // Resize the array to actual used size (k elements)
        result.arr = Arrays.copyOf(result.arr, k);

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mixer m1 = new Mixer();
        m1.accept(sc);
        m1.display();

        Mixer m2 = new Mixer();
        m2.accept(sc);
        m2.display();

        Mixer m3 = m1.mix(m2);
        System.out.println("Merged array:");
        m3.display();

        sc.close();
    }
}
