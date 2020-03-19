package lesson08.shape;

public class Triangle extends AbstractShape {

    private double triangleSideA, triangleSideB, triangleSideC;

    public Triangle(double triangleSideA, double triangleSideB, double triangleSideC) {
        super("Triangle");
        this.triangleSideA = triangleSideA;
        this.triangleSideB = triangleSideB;
        this.triangleSideC = triangleSideC;
    }

    @Override
    public double getArea() {
        double triangleSemiPerimeter = (triangleSideA + triangleSideB + triangleSideC) / 2;
        return Math.sqrt(triangleSemiPerimeter * (triangleSemiPerimeter - triangleSideA)
                * (triangleSemiPerimeter - triangleSideB)
                * (triangleSemiPerimeter - triangleSideC));
    }
}
