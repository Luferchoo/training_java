import java.util.ArrayList;
import java.util.Scanner;

public class averageList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (enter -1 to stop):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            numbers.add(num);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.size();

        System.out.println("Average: " + average);
    }
}
