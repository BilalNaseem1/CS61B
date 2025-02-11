public class Circle extends Shape {

    // overriding the Abstract area method
    double radius;
    

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

}