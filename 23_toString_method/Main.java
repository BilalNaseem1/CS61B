// toString method is a method that returns a string representation of an object
// it is used to convert an object to a string
// it is used to display an object in a user-friendly way

// we would need to override the toString method if we want to display an object in a user-friendly way

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red");

        System.out.println(car1);
        System.out.println(car1.model);
        System.out.println(car1.color);

    }
}