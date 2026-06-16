package ruchika.shape;



// Child class Rectangle
public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor for Rectangle
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Implementing the abstract method getArea()
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void area() {

    }
}




