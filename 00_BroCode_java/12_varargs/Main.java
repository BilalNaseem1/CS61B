
public class Main {

    public static void main(String[] args) {

        int output = add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(output);
    }

    static int add(int... numbers) {
        int sum = 0;

        for (int i : numbers) {
            sum += i;

        }

        return sum;
    }
}