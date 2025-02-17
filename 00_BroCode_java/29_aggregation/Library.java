public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo() {
        System.out.println("Library Name: " + this.name);
        System.out.println("Library Year: " + this.year);
        System.out.println("Library Books: ");
        for (Book book : this.books) {
            System.out.println(book.displayInfo());
        }
    }
}