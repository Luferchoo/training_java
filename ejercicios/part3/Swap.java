import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};

        // Print the values of the array
        for (int value : array) {
            System.out.println(value);
        }

        // Ask for two indices to swap
        System.out.println("\nGive two indices to swap:");
        Scanner scanner = new Scanner(System.in);
        int index1 = scanner.nextInt();
        int index2 = scanner.nextInt();

        // Swap the values at the given indices
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        // Print the values of the array after swapping
        for (int value : array) {
            System.out.println(value);
        }
    }
}
