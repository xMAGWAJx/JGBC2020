package lesson06.numberservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

  @Test
  void test1_rangeSum() {

    NumberService victim = new NumberService();

    int expected = 25;

    int actual = victim.rangeSum(3,7);

    assertEquals(expected, actual);

  }

  @Test
  void test2_rangeSum_reverse() {

    NumberService victim = new NumberService();

    int expected = 25;

    int actual = victim.rangeSum(7,3);

    assertEquals(expected, actual);

  }

  @Test
  void test3_rangeEvenCount() {

    NumberService victim = new NumberService();

    int expected = 4;

    int actual = victim.rangeEvenCount(2,9);

    assertEquals(expected, actual);

  }

  @Test
  void test4_rangeEvenCount_reverse() {

    NumberService victim = new NumberService();

    int expected = 4;

    int actual = victim.rangeEvenCount(9,2);

    assertEquals(expected, actual);

  }
}