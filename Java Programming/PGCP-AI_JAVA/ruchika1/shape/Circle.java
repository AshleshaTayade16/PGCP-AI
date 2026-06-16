package ruchika.shape;

//child class Circle
public class Circle extends Shape {
    private final double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method getArea()
    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public void area() {

    }

}
