package lesson7.sortswap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    @Test
    void sort() {
        int[] actualResultArray = {2,5,8,3,9};
        int[] expectedResultArray = {2,3,5,8,9};

        ArrayService arrayService = new ArrayService();
        arrayService.sort(actualResultArray);

        String expectedResult = Arrays.toString(expectedResultArray);
        String actualResult = Arrays.toString(actualResultArray);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void swap() {
        int[] actualResultArray = {9,7,5,8,2,1,6,3};
        int[] expectedResultArray = {3,6,1,2,8,5,7,9};

        ArrayService arrayService = new ArrayService();
        arrayService.swap(actualResultArray);

        String expectedResult = Arrays.toString(expectedResultArray);
        String actualResult = Arrays.toString(actualResultArray);

        assertEquals(expectedResult, actualResult);

    }
}