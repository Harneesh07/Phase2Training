abstract class LibraryItem {

    String title;
    int itemId;
    boolean isAvailable;

    LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    abstract int getLoanPeriod();

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("Available: " + isAvailable);
        System.out.println("Loan Period: " + getLoanPeriod() + " days");
    }
}


// Interface
interface Borrowable {

    void borrowItem();

    void returnItem();
}


// Book inherits LibraryItem
// Book also implements Borrowable
class Book extends LibraryItem implements Borrowable {

    Book(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 14;
    }

    @Override
    public void borrowItem() {

        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {

        isAvailable = true;
        System.out.println(title + " returned.");
    }
}


// Magazine inherits LibraryItem
// Magazine does NOT implement Borrowable
class Magazine extends LibraryItem {

    Magazine(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 0;
    }
}


// DVD inherits LibraryItem
// DVD also implements Borrowable
class DVD extends LibraryItem implements Borrowable {

    DVD(String title, int itemId) {
        super(title, itemId);
    }

    @Override
    int getLoanPeriod() {
        return 7;
    }

    @Override
    public void borrowItem() {

        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {

        isAvailable = true;
        System.out.println(title + " returned.");
    }
}


// Main class
public class LibraryManagement {

    public static void main(String[] args) {

        Book book = new Book("Java Programming", 101);

        Magazine magazine = new Magazine("Tech Magazine", 102);

        DVD dvd = new DVD("Inception", 103);


        // Display details
        book.display();

        System.out.println();

        magazine.display();

        System.out.println();

        dvd.display();


        // Borrow Book
        System.out.println("\n--- Book ---");
        book.borrowItem();


        // Borrow DVD
        System.out.println("\n--- DVD ---");
        dvd.borrowItem();


        // Attempt to borrow Magazine
        System.out.println("\n--- Magazine ---");

        if (magazine instanceof Borrowable) {
            ((Borrowable) magazine).borrowItem();
        } else {
            System.out.println("Magazine cannot be borrowed.");
        }


        // Return Book
        System.out.println("\n--- Return Book ---");
        book.returnItem();


        // Return DVD
        System.out.println("\n--- Return DVD ---");
        dvd.returnItem();
    }
}