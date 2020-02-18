package lesson4.signcomparator;

public class SignComparatorTest {

  public static void main(String[] args) {

      SignComparatorTest testRunner = new SignComparatorTest();

      // Correct values are passed for tests: 1,2,3

      testRunner.test1();
      testRunner.test2();
      testRunner.test3();

      // Incorrect values are passed for tests: 4,5,6

      testRunner.test4();
      testRunner.test5();
      testRunner.test6();

  }

  public void test1() {
    String testDescription = "Test1: Return correct positive value";

    SignComparator victim = new SignComparator();

    int number = 4;

    String expectedResult = "Number is positive";
    String actualResult = victim.compare(number);

    checkThatEqual(expectedResult, actualResult, testDescription);
  }

  public void test2() {
    String testDescription = "Test2: Return correct zero value";

    SignComparator victim = new SignComparator();

    int number = 0;

    String expectedResult = "Number is equal to zero";
    String actualResult = victim.compare(number);

    checkThatEqual(expectedResult, actualResult, testDescription);
  }

  public void test3() {
    String testDescription = "Test3: Return correct negative value";

    SignComparator victim = new SignComparator();

    int number = -3;

    String expectedResult = "Number is negative";
    String actualResult = victim.compare(number);

    checkThatEqual(expectedResult, actualResult, testDescription);
  }

  public void test4() {
    String testDescription = "Test4: Pass negative value for positive number check";

    SignComparator victim = new SignComparator();

    int number = -7;

    String expectedResult = "Number is positive";
    String actualResult = victim.compare(number);

    checkThatEqual(expectedResult, actualResult, testDescription);
  }

  public void test5() {
    String testDescription = "Test5: Pass positive value for negative number check";

    SignComparator victim = new SignComparator();

    int number = 8;

    String expectedResult = "Number is negative";
    String actualResult = victim.compare(number);

    checkThatEqual(expectedResult, actualResult, testDescription);
  }

  public void test6() {
    String testDescription = "Test6: Pass positive value for zero value check";

    SignComparator victim = new SignComparator();

    int number = 8;

    String expectedResult = "Number is equal to zero";
    String actualResult = victim.compare(number);

    checkThatEqual(expectedResult, actualResult, testDescription);
  }

  public void checkThatEqual (String expected, String actual, String testDescription) {
    if (expected.equals(actual)) {
      System.out.println(testDescription + " has passed!");
    } else {
      System.out.println(testDescription + " has failed!");
      System.out.println("Expected result = '" + expected + "' but result was = '" + actual + "'");
    }
  }
}
