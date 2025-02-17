public class Student extends Person {
    double gpa;

    // Student Constructor
    // Since the constructor of the parent requires two arguments, First and
    // LastName - we have to pass these arguments to the parent
    // any arguments which the parent requires - we have to pass them from the child
    // constructor
    Student(String FirstName, String LastName, double gpa) {
        super(FirstName, LastName);
        this.gpa = gpa;

    }

    void aboutStudent() {

        System.out.println(this.FirstName + " " + this.LastName + " has a gpa of " + this.gpa);
    }
}