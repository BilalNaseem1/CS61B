// Overloaded constructors in Java are constructors in the same class that share the same name but have different parameter lists (type, number, or order).
// They allow performing similar operations with different inputs.

// They allow the class to have multiple constructors with different parameter lists.
// They enable objects to be initialized in various ways.

public class Main {
    public static void main(String[] args) {

        User user0 = new User();
        System.out.println(" ****** USER 0 ATTRIBUTES ******");
        System.out.println(user0.username);
        System.out.println(user0.email);
        System.out.println(user0.age);
        System.out.println(" ****************************");
        System.out.println(" ****************************");


        User user1 = new User("Spongebob", "4kX5i@example.com", 20);
        System.out.println(" ****** USER 1 ATTRIBUTES ******");
        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        System.out.println(" ****** USER 1 ATTRIBUTES ******");


    }
}