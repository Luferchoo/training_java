import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (enter -1 to stop):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            numbers.add(num);
        }

        int greatest = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number > greatest) {
                greatest = number;
            }
        }

        System.out.println("The greatest number: " + greatest);
    }
}
