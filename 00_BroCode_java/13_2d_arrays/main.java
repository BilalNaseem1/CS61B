// A 2d Array is an array in which each element is an array - useful for storing a matrix of data

public class main {
    public static void main(String[] args) {

        String[] fruits = { "apple", "banana", "orange" };
        String[] vegetables = { "carrot", "spinach", "broccoli" };
        String[] meats = { "chicken", "beef", "pork" };

        String[][] groceryList = { fruits, vegetables, meats };

        for (String[] i : groceryList) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");

        }
    }

}