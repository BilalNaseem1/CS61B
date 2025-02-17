// Arraylists only work with objects

// Arraylists are dynamic arrays i.e. resizeable arrays which are used to store a collection of objects 
// We can store primitive data types (int, char, etc.) as well but for that we need to use wrapper classes (autoboxing)
// Arrays are fixed in size but ArrayLists are dynamic

import java.util.ArrayList;

public class Main {
public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<Integer>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    System.out.println(list);
    list.remove(2);

    System.out.println(list);

    ArrayList<Double> list2 = new ArrayList<Double>();

    list2.add(1.0);
    list2.add(2.0);
    list2.add(3.0);
    list2.add(4.0);
    list2.add(5.0);

    System.out.println(list2);

    ArrayList<String> list3 = new ArrayList<String>();

    list3.add("Hello");
    list3.add("World");
    list3.add("How");
    list3.add("Are");
    list3.add("You");

    System.out.println(list3);
    System.out.println(list3.get(2));
    System.out.println(list3.size());
    System.out.println(list3.contains("Hello"));
}
    
}