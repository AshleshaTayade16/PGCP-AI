package ruchika.shape;

//3. Inheritance & Polymorphism
//Create a base class Shape with a method area().
//        - Derive two classes: Circle and Rectangle.
//- Override the area() method in both classes to calculate respective areas.
//        - Demonstrate runtime polymorphism by calling area() using a Shape reference.

public abstract class Shape {
    int a;
    int b;

    // Implementing the abstract method getArea()
    public abstract double getArea();

    public abstract void area();


    public void printInfo() {
        System.out.println("This is a shape.");
    }



}
