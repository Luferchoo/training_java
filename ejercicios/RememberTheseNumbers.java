import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        int indice = 0;
        // Create an ArrayList to store the inputs
        ArrayList<Integer> inputs = new ArrayList<>();
        
        // Read inputs from the user and add them to the list
        while (true) {
            System.out.print("Enter a value (or press Enter to stop): ");
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            inputs.add(input);
        }
        while(indice < inputs.size()){
            System.out.println(inputs.get(indice));
            indice++;
        }
        
        // Close the Scanner
        scanner.close();
    }
}
