public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // making a constructor - to give each object a unique name
    // A constructor is a special method within a class 

    // className() {}

    Student(String name, int age, double gpa) {
        this.name = name;  // this keyword refers to the current object i.e. student1.name = name_received
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true; // default
    }

    // all students have the method of study
    void study() {
        System.out.println(name + " is studying");
    }
}

// We call the constructor when we instantiate an object of that class