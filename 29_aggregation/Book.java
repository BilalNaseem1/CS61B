public class Book {

    String title;
    String author;
    int pages;

    Book (String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    String displayInfo () {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }

    

    
}