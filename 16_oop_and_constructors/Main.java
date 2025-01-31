// object is an entity that holds data (attributes) and can perform actions (methods)

// A class serves as a blueprint to create objects

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //utilizing the car class to create a car object
        Car car = new Car();
        System.out.println("****** CAR ATTRIBUTES ******");
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);
        System.out.println("****** CAR ATTRIBUTES ******");

        // we can also modify the attributes of the car object

        // Calling methods from the Car class
        car.start();
        car.stop();


        // CONSTRUCTORS
        // By passing in arguments, we can create unique objects

        Student student1 = new Student("Spongebob", 30, 3.2);
        Student student2 = new Student("Patrick", 22, 2.7);

        System.out.println("*** STUDENT 1 ATTRIBUTES ***");
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();
        System.out.println("*** STUDENT 2 ATTRIBUTES ***");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
        student2.study();
    }
}