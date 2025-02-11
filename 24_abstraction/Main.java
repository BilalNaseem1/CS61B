// Abstraction - It is a process of hiding the implementation details and
// showing only the functionality to the user
// abstract class is a class that cannot be instantiated directly

// The shape class is an abstract class - we cannot create an object of the
// shape class
// The shape class is a parent class for the circle class and so on...

// Abstract methods are methods which must be implemented in the child class
//

public class Main {

    public static void main(String[] args) {

        // // This will throw an error because Shape is an abstract class
        // Shape shape = new Shape();

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(7,6);

        circle.display();
        triangle.display();
        rectangle.display();


        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

    }
}