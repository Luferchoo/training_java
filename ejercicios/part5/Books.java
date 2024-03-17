import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Name (empty will stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());

            Book newBook = new Book(name, year);

            if (books.contains(newBook)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(newBook);
            }
        }

        System.out.println("\nThank you! Books added: " + books.size());
    }
}

class Book {
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book otherBook = (Book) obj;
        return publicationYear == otherBook.publicationYear && name.equals(otherBook.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 31 * publicationYear;
    }
}
