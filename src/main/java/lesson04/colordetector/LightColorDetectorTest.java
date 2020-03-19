package lesson04.colordetector;

public class LightColorDetectorTest {

  public static void main(String[] args) {

    LightColorDetectorTest testRunner = new LightColorDetectorTest();
    testRunner.test1();
    testRunner.test2();
    testRunner.test3();
    testRunner.test4();
    testRunner.test5();
    testRunner.test6();
    testRunner.test7();
  }

  public void test1() {

    String testDescription = "Test1: Should successfully pass with value '380' and return 'Violet'. \nTest";

    LightColorDetector victim = new LightColorDetector();

    int wavelength = 380;

    String expectedResult = "Violet";
    String actualResult = victim.detect(wavelength);

    checkThatEqual (expectedResult, actualResult, testDescription);
  }

  public void test2() {

    String testDescription = "Test2: Should successfully pass with value '449' and return 'Violet'. \nTest";

    LightColorDetector victim = new LightColorDetector();

    int wavelength = 449;

    String expectedResult = "Violet";
    String actualResult = victim.detect(wavelength);

    checkThatEqual (expectedResult, actualResult, testDescription);
  }

  public void test3() {

    String testDescription = "Test3: Should successfully pass with value '450' and return 'Blue'. \nTest";

    LightColorDetector victim = new LightColorDetector();

    int wavelength = 450;

    String expectedResult = "Blue";
    String actualResult = victim.detect(wavelength);

    checkThatEqual (expectedResult, actualResult, testDescription);
  }

  public void test4() {

    String testDescription = "Test4: Should successfully pass with value '777' and return 'Invisible Light'. \nTest";

    LightColorDetector victim = new LightColorDetector();

    int wavelength = 777;

    String expectedResult = "Invisible Light";
    String actualResult = victim.detect(wavelength);

    checkThatEqual (expectedResult, actualResult, testDescription);
  }

  public void test5() {

    String testDescription = "Test5: Should successfully pass with value '222' and return 'Invisible Light'. \nTest";

    LightColorDetector victim = new LightColorDetector();

    int wavelength = 222;

    String expectedResult = "Invisible Light";
    String actualResult = victim.detect(wavelength);

    checkThatEqual (expectedResult, actualResult, testDescription);
  }

  public void test6() {

    String testDescription = "Test6: Should fail with '591' passed as wave length and 'Red' passed as expected result. For 590 ... 619 range color should return 'Orange'.\nTest";

    LightColorDetector victim = new LightColorDetector();

    int wavelength = 591;

    String expectedResult = "Red";
    String actualResult = victim.detect(wavelength);

    checkThatEqual (expectedResult, actualResult, testDescription);
  }

  public void test7() {

    String testDescription = "Test7: Should fail with '1000' passed as wave length and 'Yellow' passed as expected result. For 751 and > color should return 'Invisible Light'.\nTest";

    LightColorDetector victim = new LightColorDetector();

    int wavelength = 1000;

    String expectedResult = "Yellow";
    String actualResult = victim.detect(wavelength);

    checkThatEqual (expectedResult, actualResult, testDescription);
  }

  public void checkThatEqual(String expected, String actual, String testDescription) {
    if (expected.equals(actual)) {
      System.out.println(testDescription + " has passed!");
    } else {
      System.out.println(testDescription + " has failed!");
      System.out.println("Expected '" + expected + "' but was '" + actual + "'");
    }
  }
}
