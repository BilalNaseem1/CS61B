// POLY means many
// MORPH means forms
// POLYMORPHISM means many forms

// POLYMORPHISM is a feature that allows a single object to take on multiple forms
// This is done by using inheritance and overriding methods

// POLYMORPHISM is a key concept in object-oriented programming that allows a single object to take on multiple forms


// polymorphism can also be achieved by using interfaces. 
// Interfaces are a type of class that is used to define a set of methods that a class must implement


public class Main { 
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle();
        // vehicle.go();

        Car car = new Car();
        car.go();

        Boat boat = new Boat();       
        boat.go();

        Bike bike = new Bike();
        bike.go();

        Vehicle[] vehicles = {car, boat, bike}; // an array of vehicles, could be any vehicle.
        // Couldn't do this: Car[] cars = {new Boat(), new Car(), new Bike()};

        System.out.println("********************");
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}