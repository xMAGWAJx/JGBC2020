package lesson7.arrayservice;

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
}