package Library_PBO;

/**
 * Represents a comic book that extends the Book class.
 */
public class Comic extends Book {

    public Comic(String code, String title, String author, int pages) {
        super(code, title, author, pages);
    }

    @Override
    public double getPrice() {
        return this.getPages() * 50.0;
    }

    @Override
    public void view() {
        System.out.println("Book Code        : " + this.getCode());
        System.out.println("Book Title       : " + this.getTitle());
        System.out.println("Author           : " + this.getAuthor());
        System.out.println("Price (USD)      : " + this.getPrice());
    }
}
