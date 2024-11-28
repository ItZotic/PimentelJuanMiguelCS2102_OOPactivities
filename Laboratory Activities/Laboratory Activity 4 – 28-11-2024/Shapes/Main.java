public class Main {
    public static void main(String[] args) {
            Triangle triangle = new Triangle(10, 12, 15);
            Square square = new Square(10);
            Rectangle rectangle = new Rectangle(8, 12);
            Shape[] shapes = { square, rectangle, triangle};
            ShapeCollection shapeCollection = new ShapeCollection(shapes);
            shapeCollection.getPropertyValues();
    }
}