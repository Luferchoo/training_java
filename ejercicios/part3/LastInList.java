import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create an ArrayList to store the inputs
        ArrayList<String> inputs = new ArrayList<>();
        
        // Read inputs from the user and add them to the list
        while (true) {
            System.out.print("Enter a value (or press Enter to stop): ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            inputs.add(input);
        }
        
        // Print the last read value from the list
        if (!inputs.isEmpty()) {
            System.out.println("Last read value: " + inputs.get(inputs.size() - 1));
        } else {
            System.out.println("No values were entered.");
        }
        
        // Close the Scanner
        scanner.close();
    }
}
