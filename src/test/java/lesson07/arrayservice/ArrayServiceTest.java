package lesson07.arrayservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    @Test
    void create() {
        int [] arrayTest = ArrayService.create(3);

        int expectedResult = 3;
        int actualResult = arrayTest.length;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sum() {
        int [] arrayTest = ArrayService.create(3);

        arrayTest[0] = 1;
        arrayTest[1] = 2;
        arrayTest[2] = 3;

        int expectedResult = 6;
        int actualResult = ArrayService.sum(arrayTest);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void avg() {
        int [] arrayTest = ArrayService.create(4);

        arrayTest[0] = 1;
        arrayTest[1] = 2;
        arrayTest[2] = 3;
        arrayTest[3] = 4;

        double expectedResult = 2.5;
        double actualResult = ArrayService.avg(arrayTest);

        assertEquals(expectedResult, actualResult);
    }
}