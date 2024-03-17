import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        System.out.println("Enter strings (enter an empty string to stop):");
        String input;
        while (!(input = scanner.nextLine()).isEmpty()) {
            inputs.add(input);
        }

        System.out.print("Search for? ");
        String searchStr = scanner.nextLine();

        boolean found = false;
        for (String str : inputs) {
            if (str.equals(searchStr)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchStr + " was found!");
        } else {
            System.out.println(searchStr + " was not found!");
        }
    }
}
