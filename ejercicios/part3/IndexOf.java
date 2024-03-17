import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (enter -1 to stop):");
        int num;
        while ((num = scanner.nextInt()) != -1) {
            numbers.add(num);
        }

        System.out.print("Search for? ");
        int searchNum = scanner.nextInt();

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == searchNum) {
                System.out.println(searchNum + " is at index " + i);
            }
        }
    }
}
