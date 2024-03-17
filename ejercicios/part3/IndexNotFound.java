import java.util.Scanner;

public class IndexNotFound {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 3, 8, 7, 9, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Search for? ");
        int searchNum = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNum) {
                found = true;
                System.out.println(searchNum + " is at index " + i + ".");
                break;
            }
        }

        if (!found) {
            System.out.println(searchNum + " was not found.");
        }
    }
}
