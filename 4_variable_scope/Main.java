// Variable scope is the area where a variable can be used.
// There are 3 types of variable scope:
// 1. Local scope
// 2. Class scope

// LOCAL SCOPE
// inside of a method if we declare a variable, it is only accessible inside of that method. This is the local Scope.

public class Main {

    // A class variable is a variable that is declared outside of a method, and
    // inside a class. This is the class scope
    public static void main(String[] args) {

        int x = 24; // LOCAL variable

        System.out.println("x is: " + x);

        doSomething();
    } // OUTSIDE OF THESE CURLY BRACES, x IS NOT GOING TO BE RECOGNIZED

    static void doSomething() {

        int x = 2; // No warning here because it is a local variable i.e. inside of a different
                   // method
        System.out.println("Do something variable: " + x);

    }

}

// if we write "void" at the start of a method, it is a void method. This means
// that the method does not return a value.