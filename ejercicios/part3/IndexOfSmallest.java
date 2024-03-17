import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (enter 9999 to stop):");
        int num;
        while ((num = scanner.nextInt()) != 9999) {
            numbers.add(num);
        }

        // Find the smallest number
        int smallest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number < smallest) {
                smallest = number;
            }
        }

        // Print the smallest number and its indices
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index:");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallest) {
                System.out.println(i);
            }
        }
    }
}
