package lesson07.practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFunctionTest {

  @Test
  void sum() {

    ArrayFunction arrayFunction = new ArrayFunction();

    int[] arr = {1,2,3};

    int expectedResult = 6;

    int actualResult = arrayFunction.sum(arr);

    assertEquals(expectedResult, actualResult);

  }

  @Test
  void findMinValue() {
    ArrayFunction arrayFunction = new ArrayFunction();

    int[] arr = {2,4,5,7,1};

    int expectedResult = 1;

    int actualResult = arrayFunction.findMinValue(arr);

    assertEquals(expectedResult, actualResult);
  }
}