import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int dices;
        int total = 0;

        System.out.println("Enter the number of dices: ");
        dices = scanner.nextInt();

        if (dices < 1) {
            System.out.println("Invalid input");
        } else if (dices > 6) {
            System.out.println("Invalid input");
        } else {
            for (int i = 0; i < dices; i++) {
                int roll = random.nextInt(1, 7);
                total += roll;
                System.out.println("You rolled: " + roll);

            }
            System.out.println("The total sum is: " + total);
        }

        scanner.close();
    }

}