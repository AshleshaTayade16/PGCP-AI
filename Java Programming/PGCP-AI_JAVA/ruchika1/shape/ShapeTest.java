package ruchika.shape;



// Main class to test the implementation
        public class ShapeTest {
            public static void main(String[] args) {
                Rectangle rectangle = new Rectangle(5.0, 10.0);
                Circle circle = new Circle(3.0);

                // Accessing methods from Shape class using instanceof and casting
                if (rectangle instanceof Shape) {
                    System.out.println("Rectangle area: " + ((Shape) rectangle).getArea());
                }

                if (circle instanceof Shape) {
                    System.out.println("Circle area: " + ((Shape) circle).getArea());
                }
            }
        }


