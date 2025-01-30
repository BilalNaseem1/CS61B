import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status = true;

        Random random = new Random();

        String[] compQuestions = {
                "rock",
                "paper",
                "scissors"
        };

        while (status) {

            String compchoice = compQuestions[random.nextInt(compQuestions.length)];
            System.out.println("Enter your choice");
            String userChoice = scanner.nextLine();
            System.out.println(compchoice);
            if (userChoice.equals(compchoice)) {
                System.out.println("You won");
                status = false;
            } else {
                System.out.println("Try again");
            }

        }

        scanner.close();
    }
}