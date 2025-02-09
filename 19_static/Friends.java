public class Friends {
    
    String name;
    static int numOfFriend; // all objects share this variable, i.e. it is a class variable which means all objects will have the same value

    Friends(String name) {
        this.name = name;
        numOfFriend++;
    }
}