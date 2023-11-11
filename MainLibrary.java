import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        System.out.println("========WELCOME TO THE LIBRARY========");

        Scanner scanner = new Scanner(System.in);
        Guest guest;

        System.out.print("Enter your name: ");
        String guestName = scanner.nextLine();
        guest = new Guest(guestName);
        System.out.println("Welcome to the library, " + guest.getName() + "!\n");

        // Create books
        Comic comic1 = new Comic("001", "Jurnal Risa", "Risa Saraswati", 100);
        Comic comic2 = new Comic("002", "Angkasa dan 56 Hati", "Destashsya", 150);
        Comic comic3 = new Comic("003", "Harry Potter", "J. K. Rowling", 300);
        Comic comic4 = new Comic("004", "Max Havelaar", "Eduard Douwes Dekker", 200);

        Science science1 = new Science("101", "Kartun Statistik", "Woollcott Smith", "Statistics", 120);
        Science science2 = new Science("102", "Kimia Forensik", "prof.Riyanto,ph.D.", "Chemistry", 180);
        Science science3 = new Science("103", "Biologi Sel", "Oeke Yunita", "Biology", 160);
        Science science4 = new Science("104", "Anatomi Hewan", "Ruqiah Ganda Panjaitan", "Animal Structure", 140);

        History history1 = new History("201", "Sejarah Dunia yang Disembunyikan", "Jonathan Black", "World History", 240);
        History history2 = new History("202", "Sapiens", "Yuval Noah Harari", "History of Humans", 220);
        History history3 = new History("203", "The History of the Ancient World", "W. W. Norton & Company", "General History", 200);
        History history4 = new History("204", "Percakapan Dengan Stalin", "Milovan Djilas", "Philosophy", 180);

        Magazine magazine1 = new Magazine("301", "National Geographic", "Various Authors", 80);
        Magazine magazine2 = new Magazine("302", "Time", "Various Authors", 70);
        Magazine magazine3 = new Magazine("303", "Scientific American", "Various Authors", 90);
        Magazine magazine4 = new Magazine("304", "The New Yorker", "Various Authors", 60);

        Textbook textbook1 = new Textbook("401", "Introduction to Computer Science", "John Smith", 400);
        Textbook textbook2 = new Textbook("402", "Mathematics for Engineers", "Alice Johnson", 350);
        Textbook textbook3 = new Textbook("403", "Biology Fundamentals", "David Brown", 320);
        Textbook textbook4 = new Textbook("404", "History of Art", "Laura Davis", 280);

        Book[] books = {
                comic1, comic2, comic3, comic4,
                science1, science2, science3, science4,
                history1, history2, history3, history4,
                magazine1, magazine2, magazine3, magazine4,
                textbook1, textbook2, textbook3, textbook4
        };
    }

}
