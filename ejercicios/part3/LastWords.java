import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string (or press Enter to stop): ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            String[] parts = input.split("\\s+");
            if (parts.length > 0) {
                System.out.println(parts[parts.length -1]);
            }
        }
    }
}