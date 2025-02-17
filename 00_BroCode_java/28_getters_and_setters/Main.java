// Getter and Setter
// Getters and Setters are used to access and modify private variables
// for example, a getter is used to retrieve the value of a private variable and a setter is used to modify the value of a private variable

// Getter methods are used to retrieve the value of a private variable
// Setter methods are used to modify the value of a private variable

public class Main {
    
    public static void main(String[] args) {
        
        Car car1 = new Car("Mustang", "Red", 50000);

        System.out.println(car1);

        // // will give error
        // System.out.println(car1.color);
        // System.out.println(car1.model);
        // System.out.println(car1.price);

        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getPrice());

        car1.setModel("Tesla");
        car1.setColor("Blue");
        car1.setPrice(100000);

        System.out.println("**************************");
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getPrice());

    }
}