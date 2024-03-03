// Client
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create a circle
        Shape circle = shapeFactory.getsShape("Circle");
        circle.draw(); // Output: Drawing Circle

        // Create a square
        Shape square = shapeFactory.getsShape("Rectangle");
        square.draw(); // Output: Drawing Square
    }
}