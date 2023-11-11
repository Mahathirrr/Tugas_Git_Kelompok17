/**
 * Represents a history book that extends the Book class.
 */
public class History extends Book {
    private String subfield;

    public History(String code, String title, String author, String subfield, int pages) {
        super(code, title, author, pages);
        this.subfield = subfield;
    }

    @Override
    public double getPrice() {
        return this.getPages() * 60.0;
    }

    @Override
    public void view() {
        System.out.println("Book Code        : " + this.getCode());
        System.out.println("Pages           : " + this.getPages());
        System.out.println("Book Title       : " + this.getTitle());
        System.out.println("Author           : " + this.getAuthor());
        System.out.println("Subfield         : " + this.subfield);
        System.out.println("Price (USD)      : " + this.getPrice());
    }
}
