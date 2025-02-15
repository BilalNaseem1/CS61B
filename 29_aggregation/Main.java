// Aggregation is a relationship between classes where one class has a reference to another class

// Aggregation represents a has-a relationship between objects
// One object contains another object as part of its structure, but the contained object can exist independently.

// An object can contain another object, but those objects can exist independently
// We are going to create some book objects, then we will create a library object which will contain the book objects

// The library object will be a container for the book objects, but the book objects can exist independently

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Book 1", "Author 1", 423);
        Book book2 = new Book("Book 2", "Author 2", 234);
        Book book3 = new Book("Book 3", "Author 3", 345);

        Book[] books = { book1, book2, book3 };

        for (Book book : books) {
            System.out.println(book.displayInfo());
        }

        Library library = new Library("Library 1", 1996, books);

        library.displayInfo();
}
}