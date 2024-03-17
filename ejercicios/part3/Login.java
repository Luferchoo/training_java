import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // Define the valid usernames and passwords
        String[][] users = {
            {"alex", "sunshine"},
            {"emma", "haskell"}
        };

        // Get username and password from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if the username and password match any user
        boolean loggedIn = false;
        for (String[] user : users) {
            if (user[0].equals(username) && user[1].equals(password)) {
                loggedIn = true;
                break;
            }
        }

        // Print the appropriate message
        if (loggedIn) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
