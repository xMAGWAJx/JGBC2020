package lesson08.shape;

public class Square extends AbstractShape {

    private double squareSide;

    public Square(double squareSide) {
        super("Square");
        this.squareSide = squareSide;
    }

    @Override
    public double getArea() {
        return (squareSide * squareSide);
    }
}
