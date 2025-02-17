// constructing few car objects

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("BMW", "Black");
        Car car4 = new Car("Ferrari", "Red");


        Car[] cars = { car1, car2, car3, car4 };


        for (Car i : cars) {
            i.drive();
        }

        for (Car i: cars) {
            i.color = "Green";
        }
        System.out.println("*************************");
        for (Car i : cars) {
            i.drive();
        }


    }
}