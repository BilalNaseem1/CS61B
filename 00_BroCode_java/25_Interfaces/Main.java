// An **interface** defines only method signatures, enforcing rules without implementation.  

// An **abstract class** can have both method definitions and implementations, allowing partial functionality.

// With inheritence a class can only have a single parent, but by using interfaces a class can have multiple parents
// In this example we have created 2 interfaces

// Fish is both prey and predator
public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}