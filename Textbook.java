/**
 * Represents a textbook that extends the Book class and implements the Discount interface.
 */
public class Textbook extends Book implements Discount {

    public Textbook(String code, String title, String author, int pages) {
        super(code, title, author, pages);
    }

    @Override
    public double getPrice() {
        return this.getPages() * 150.0;
    }

    @Override
    public void view() {
        System.out.println("Book Code        : " + this.getCode());
        System.out.println("Book Title       : " + this.getTitle());
        System.out.println("Author           : " + this.getAuthor());
        System.out.println("Original Price (USD) : " + this.getPrice());
        System.out.println("Discount (USD)   : " + this.calculateDiscount());
        System.out.println("Final Price (USD): " + (this.getPrice() - this.calculateDiscount()));
    }

    @Override
    public double calculateDiscount() {
        double discount = 0.02;
        return discount * this.getPrice();
    }
}
