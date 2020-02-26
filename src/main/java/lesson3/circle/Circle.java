package lesson3.circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double pi = 3.14;
        double area = pi * radius * radius;
        return area;
    }

}
