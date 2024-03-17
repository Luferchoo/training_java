public class Book {
    private String author;
    private String title;
    private int pageCount;

    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + pageCount + " pages";
    }

    public static void main(String[] args) {
        Book book = new Book("J. K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
        System.out.println(book);
    }
}
