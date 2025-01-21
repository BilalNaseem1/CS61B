import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String last_name = scanner.nextLine();

        System.out.println(full_name(name, last_name));
        // System.out.println("Hi: " + subract(1, 2));

    }

    static double add(double a, double b) {
        return a + b;
    }

    static double subract(double a, double b) {
        return a - b;
    }

    static String full_name(String first_name, String last_name) {
        return first_name + " " + last_name;
    }
}
