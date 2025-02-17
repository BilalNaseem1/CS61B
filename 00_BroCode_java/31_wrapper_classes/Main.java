// Wrapper classes in Java provide a way to use primitive data types (int, char, etc.) as objects. They are part of the java.lang package.


public class Main {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive to Wrapper object
        Integer intObj = 10;
        Double doubleObj = 10.5;

        // Unboxing: Converting Wrapper to primitive
        int intValue = intObj;
        double doubleValue = doubleObj;

        // Using utility methods
        int parsedInt = Integer.parseInt("123");
        String intToString = Integer.toString(456);

        // Displaying values
        System.out.println("Autoboxed Integer: " + intObj);
        System.out.println("Unboxed Integer: " + intValue);
        System.out.println("Parsed Integer: " + parsedInt);
        System.out.println("Integer to String: " + intToString);
    }
}
