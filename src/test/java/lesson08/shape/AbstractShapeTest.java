package lesson08.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbstractShapeTest {

    @Test
    void getArea_Square() {

        Square testSquare = new Square(2);

        double expectedResult = 4;
        double actualResult = testSquare.getArea();

        assertEquals(expectedResult, actualResult);
    }


    @Test
    void getArea_Circle() {

        Circle testCircle = new Circle(5);

        double expectedResult = 78.53981633974483;
        double actualResult = testCircle.getArea();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void getArea_Triangle() {

        Triangle testTriangle = new Triangle(5, 6, 3);

        double expectedResult = 7.483314773547883;
        double actualResult = testTriangle.getArea();

        assertEquals(expectedResult, actualResult);
    }
}