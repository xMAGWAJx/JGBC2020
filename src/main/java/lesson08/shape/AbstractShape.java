package lesson08.shape;

public abstract class AbstractShape implements Shape {

    protected String name;
    protected double area;

    public AbstractShape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return area;
    }
}
