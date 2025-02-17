public class Person {

    String FirstName;
    String LastName;

    Person(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    void showName() {
        System.out.println(this.FirstName + " " + this.LastName);

    }
}