import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a weight: ");
        int w = scanner.nextInt();

        Dog dog = new Dog(w);

        dog.makeNoise();
    }
}