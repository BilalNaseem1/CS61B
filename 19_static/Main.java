// static modifies a variable or method so that it belongs to the class itself and not the object
// for example, static methods can be called without creating an instance of the class

// static variable and methods are mainly used for cases where you want to share data between all instances of a class 
// for example for example, maintaining a global counter, caching shared resources, 
// implementing singleton patterns, or defining utility methods that do not depend on instance-specific data. 

// static variables and methods are shared by all instances of the class

// static variables and mthods are initialized when the class is loaded, not when an instance is created

// check Friends class


public class Main {
    public static void main(String[] args) {

        Friends friend1 = new Friends("John");
        Friends friend2 = new Friends("Michael");
        Friends friend3 = new Friends("Sarah");

        System.out.println(friend1.numOfFriend);
        System.out.println(friend2.numOfFriend);
        System.out.println(friend3.numOfFriend);
        // Correct way to access a static variable
        System.out.println(Friends.numOfFriend);
 
 
    }
}