
// Overloaded methods in Java are methods in the same class that share the same name but have different parameter lists (type, number, or order).
// They allow performing similar operations with different inputs.

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String last_name = scanner.nextLine();

        System.out.println(add(name, last_name));

        System.out.println(add(1, 2));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static String add(String a, String b) {
        return a + b;
    }
}