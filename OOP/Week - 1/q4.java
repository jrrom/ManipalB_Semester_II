import java.util.Scanner;

class Main {
    static int[] rotateRight(int[] n, int swap) {
        int[] temp = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            temp[(i + swap) % n.length] = n[i];
        }

        return temp;
    }

    static int[] rotateLeft(int[] n, int swap) {
        int[] temp = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            temp[(i - swap + n.length) % n.length] = n[i];
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of spaces to swap: ");
        int swap = sc.nextInt();

        System.out.print("Enter (1) for left rotate, (2) for right rotate: ");
        int type = sc.nextInt();

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter the numbers of the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int[] finalArray = new int[size];
        switch (type) {
            case 1:
                finalArray = rotateLeft(nums, swap);
                break;
            case 2:
                finalArray = rotateRight(nums, swap);
                break;
            default:
                System.out.println("Error: Invalid input for type of rotation.");
                System.exit(0);
                break;
        }

        for (int num : finalArray) {
            System.out.print(num + " ");
        }
    }
}