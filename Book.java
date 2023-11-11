/**
 * Represents an abstract book.
 */
public abstract class Book {
    private String code;
    private String title;
    private String author;
    private int pages;

    public Book(String code, String title, String author, int pages) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public abstract double getPrice();

    public abstract void view();
}
