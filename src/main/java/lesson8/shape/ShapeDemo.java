package lesson8.shape;

public class ShapeDemo {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Square(4);
        shapes[1] = new Circle(2);
        shapes[2] = new Triangle(2,2,2);
        shapes[3] = new Triangle(3,2,4);

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " : " + shape.getArea());
        }
    }
}
