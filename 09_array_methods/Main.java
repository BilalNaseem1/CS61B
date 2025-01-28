import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = { 16, 7, 8, 17, 0, 5 };

        // Converting array to String
        System.out.println(Arrays.toString(numbers));

        // Sorting array
        // Arrays.sort(numbers);
        Arrays.sort(numbers);

        for (int i : numbers) {
            System.out.println(i);
        }
        // System.out.println(newArray);

    }
}