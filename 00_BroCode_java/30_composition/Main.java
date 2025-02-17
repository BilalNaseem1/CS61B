// Composition in Java is a design principle where one class contains an instance of another class, 
// meaning the contained object cannot exist independently of the containing class. 
// It represents a strong "has-a" relationship (i.e., the lifecycle of the contained object depends on the container).

// Composition represents a part-of relationship between objects
// One object is a part of another object, but the contained object can exist independently
// For example, a car has an engine, but the engine can exist independently of the car
// Engine is part of a car
// Composition allows complex objects to be built from simpler ones

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Corvette", 1996, "V6");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.engine.start();
    }
    
}

// We have an object that is composed of another object
