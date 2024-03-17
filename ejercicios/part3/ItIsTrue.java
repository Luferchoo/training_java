import java.util.Scanner;

public class ItIsTrue {
    public static void main(String[] args) {
        String text = "true";
        if (!(text.equals("true"))) {  // true if the condition text.equals("cake") is false
            System.out.println("it wasn't!");
        } else {
            System.out.println("it was!");
        }
    }
}
