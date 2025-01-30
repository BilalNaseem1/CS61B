import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // array of questions
        String[] questions = {
                "What is the capital of France?",
                "What is the capital of Italy?",
                "What is the capital of Germany?",
                "What is the capital of Spain?",
                "What is the capital of Portugal?",
        };

        // array of options
        String[][] options = {
                { "London", "Paris", "Berlin", "Madrid" },
                { "Rome", "Milan", "Naples", "Venice" },
                { "Berlin", "Munich", "Frankfurt", "Hamburg" },
                { "Madrid", "Barcelona", "Seville", "Valencia" },
                { "Lisbon", "Porto", "Braga", "Faro" },
        };

        int[] answers = { 1, 0, 2, 3, 2 };

        int score = 0;
        int guess;

        System.out.println("Welcome to the Quiz Game");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            int answer = scanner.nextInt();
            if (answer == answers[i]) {
                System.out.println("Correct Answer");
                score++;
                System.out.println("score is now " + score);

            } else {
                System.out.println("Incorrect Answer");
            }

        }
        System.out.println("Final Score is " + score);

        scanner.close();

    }

}
