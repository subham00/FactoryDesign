public class ShapeFactory {
    Shape getsShape(String st){
        switch (st) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();  
            default:
                return null;
        }
    }
}
