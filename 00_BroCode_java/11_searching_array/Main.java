import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] number = { 1, 9, 2, 8, 3, 5, 4 };
        boolean isFound = false;

        System.out.println("Enter a number: ");
        int target = scanner.nextInt();

        for (int i : number) {
            // System.out.println(i);
            if (i == target) {
                System.out.println("Found");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Not found");
        }
    }
}
