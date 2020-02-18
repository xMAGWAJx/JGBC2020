package lesson4.signcomparator;

public class SignComparatorTest {

  public static void main(String[] args) {

      SignComparatorTest testRunner = new SignComparatorTest();
      testRunner.test1();
  }

  public void test1() {
    String testDescription = "Return correct positive value";

    SignComparator victim = new SignComparator();

    int expectedResult = 4;
    int actualResult = victim.compare(4);

    checkThatEqual(expectedResult, actualResult, testDescription);
  }

  public void checkThatEqual (int expected, int actual, String testDescription) {
    if (expected == actual) {
      System.out.println(testDescription + " has passed!");
    } else {
      System.out.println(testDescription + " has failed!");
      System.out.println("Expected '" + expected + "' but was '" + actual + "'");
    }
  }
}
