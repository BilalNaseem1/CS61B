public class Friends {
    
    String name;
    static int numOfFriend; // all objects share this variable, i.e. it is a class variable which means all objects will have the same value

    // constructor
    Friends(String name) {
        this.name = name;
        numOfFriend++;
    }

    static void printNumOfFriend() {
        // we dont need this.name because it is a class variable
        System.out.println("Number of friends: " + numOfFriend);
    }
}