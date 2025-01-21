
public class Main2 {
    static int x = 3; // This is a static variable. And has a class Scope

    public static void main(String[] args) {
        System.out.println("Main method: " + x);
        doSomething();

    }

    static void doSomething() {
        System.out.println("Do something method: " + x);
    }
}

// ❯ java Main2
// Main method: 3
// Do something method: 3

// If there is a local variable, then it is given priority