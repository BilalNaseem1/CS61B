import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = new String[3];

        for (int i = 0; i <= fruits.length - 1; i++) {
            System.out.println("Enter a fruit: ");
            fruits[i] = scanner.nextLine();
        }

        System.out.println("The final array is: ");

        for (int i = 0; i <= fruits.length - 1; i++) {
            System.out.println(fruits[i]);
        }
    }
}