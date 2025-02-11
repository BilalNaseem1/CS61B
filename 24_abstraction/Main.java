// Abstraction - It is a process of hiding the implementation details and
// showing only the functionality to the user
// abstract class is a class that cannot be instantiated directly

// The shape class is an abstract class - we cannot create an object of the
// shape class
// The shape class is a parent class for the circle class and so on...

// abstract classes can contain abstract methods which must be implemented by its children
//

public class Main {

    public static void Main(String[] args) {

        // // This will throw an error because Shape is an abstract class
        // Shape shape = new Shape();

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

    }
}