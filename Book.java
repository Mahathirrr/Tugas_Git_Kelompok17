package PairedBooks;

/**
 * Represents an abstract book.
 */
public abstract class Book {
    private String code;
    private String title;

    public Book(String code, String title, String author, int pages) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getPrice();

    public abstract void view();
}
