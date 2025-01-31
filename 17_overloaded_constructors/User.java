public class User {
    String username;
    String email;
    int age;

    // Default constructor i.e. making the above fields optional
    User() {
        this.username = "Not Provided";
        this.email = "default";
        this.age = 0;
    }

    // Overloaded constructor
    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}