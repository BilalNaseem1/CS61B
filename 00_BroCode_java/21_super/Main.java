// super just refers to the parent class when using inheritence

// child class is known as -> sub-class
// parent class is known as -> super-class

// SUPER JUST MEANS PARENT

// super keyword is used inside constructors to call the parent class constructor to initialize the parent class attributes

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Bilal", "Naseem");

        person.showName();

        Student student = new Student("Sara", "Hussain", 3.14);

        student.aboutStudent();

        Employee employee = new Employee("John", "Doe", 100000);

        employee.aboutEmployee();

    }

}