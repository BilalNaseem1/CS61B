public class Employee extends Person {
    double salary;

    Employee(String FirstName, String LastName, double salary) {
        super(FirstName, LastName);
        this.salary = salary;
    }

    void aboutEmployee() {
        System.out.println(this.FirstName + " " + this.LastName + " has a salary of " + this.salary);
    }
}