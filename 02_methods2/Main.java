import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = scanner.nextInt();

        String result = ageCheck(age);
        System.out.println(result);
    }

    static String ageCheck(int age) {
        if (age >= 18) {
            return "Age is: " + age;
        } else {
            return "Age is below: 18";
        }
    }
}