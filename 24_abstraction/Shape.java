// we cannot create any shape objects
public abstract class Shape {

    // Abstract method
    abstract double area();

    // Concrete method - a method that has a body
    void display() {
        System.out.println("This is a shape");
    }

}