package lesson6.numberservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTestTest {

  @Test
  void test1() {

    NumberService victim = new NumberService();

    int expected = 4;

    int actual = victim.rangeEvenCount(2,9);

    assertEquals(expected, actual);



  }
}