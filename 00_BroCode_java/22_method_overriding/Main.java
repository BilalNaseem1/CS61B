// method overriding allows a subclass to provide its own implementation of a method that is already defined in its parent class
// this can be done by simply defining a method with the same name in the subclass

// it is good practice to use @Override annotation to indicate that the method is intended to override a method in the parent class
// It also provides a compile-time check to ensure that the overridden method has the same signature as the overridden method in the parent class

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();

    }
}