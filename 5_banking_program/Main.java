import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0; // Declare variables
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            // Display menu
            System.out.println("\n***********************");
            System.out.println("Banking Program");
            System.out.println("***********************");
            System.out.println("Options:");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***********************");

            System.out.println("Enter your choice (1-4):");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance); // Show balance
                case 2 -> balance = balance + deposit();
                case 3 -> {
                    if (balance <= 0) {
                        System.out.println("Your balance is 0, you cannot withdraw");
                    } else {
                        balance = balance - withdraw();
                    }
                }
                case 4 -> {
                    isRunning = false;
                    System.out.println("Thank you for using our banking program. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        }

        scanner.close();
    }

    // Display balance
    static void showBalance(double balance) {
        System.out.println("\n***********************");
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    static double deposit() {
        double amount;
        System.out.println("Enter an amount to deposit: ");
        amount = scanner.nextInt();

        if (amount < 0) {
            System.out.println("Amount cannot be negative");
            return 0;
        } else {
            return amount;
        }

    }

    static double withdraw() {

        double amount = 0;

        System.out.println("Enter the amount to withdraw: ");
        amount = scanner.nextInt();

        if (amount < 1) {
            amount *= -1;
            return amount;
        } else {
            return amount;
        }
    }

}
