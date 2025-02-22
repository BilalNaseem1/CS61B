public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.weightInPounds = 10;
        dog2.weightInPounds = 20;

        Dog.maxDog(dog1, dog2);
        
    }
}