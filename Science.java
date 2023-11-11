/**
 * Represents a science book that extends the Book class.
 */
public class Science extends Book {
    private String field;

    public Science(String code, String title, String author, String field, int pages) {
        super(code, title, author, pages);
        this.field = field;
    }

    @Override
    public double getPrice() {
        return this.getPages() * 75.0;
    }

    @Override
    public void view() {
        System.out.println("Book Code        : " + this.getCode());
        System.out.println("Book Title       : " + this.getTitle());
        System.out.println("Author           : " + this.getAuthor());
        System.out.println("Field            : " + this.field);
        System.out.println("Price (USD)      : " + this.getPrice());
    }
}
