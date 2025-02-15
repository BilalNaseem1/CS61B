// Runtime Polymorphism aka Dynamic Polymorphism means that the type of an object is determined at runtime, not at compile time

// Dynamic polymorphism is achieved by using interfaces and the "instanceof" operator



public class Main {
    public static void main(String[] args) {

        Animal animal = new Cat();
        Animal animal2 = new Dog();

        animal.speak();
        animal2.speak();
    }
}