package lesson05.booklesson5;

public class BookTest {

  public static void main(String[] args) {
    
    BookTest testRunner = new BookTest();
    
    testRunner.test1();
    testRunner.test2();
    testRunner.test3();
    testRunner.test4();
    testRunner.test5();
    testRunner.test6();
  }

  public void test1() {
    String testDescription = "Test1: Check that set numberOfPages works correctly -";

    Book victim = new Book("Test1", "any1", 10);

    victim.setNumberOfPages(15);

    int expectedResult = 15;
    int actualResult = victim.getNumberOfPages();

    checkThatEqual (expectedResult, actualResult, testDescription);
  }

  public void test2() {
    String testDescription = "Test2: Check that setAuthorName is set correctly -";

    Book victim = new Book("Test2", "any2", 15);

    victim.setAuthorName("Test2SetName");

    String expectedResult = "Test2SetName";
    String actualResult = victim.getAuthorName();

    checkThatNamesMatch (expectedResult, actualResult, testDescription);
  }

  public void test3() {
    String testDescription = "Test3: Check that setBookTitle is set correctly -";

    Book victim = new Book("Test3", "any3", 15);

    victim.setBookTitle("Test3SetBookTitle");

    String expectedResult = "Test3SetBookTitle";
    String actualResult = victim.getBookTitle();

    checkThatNamesMatch (expectedResult, actualResult, testDescription);
  }

  public void test4() {
    String testDescription = "Test4: Check that toString() method works correctly -";

    Book victim = new Book("Test4", "any4", 27);

    victim.toString();

    String expectedResult = "Book{authorName = 'Test4', bookTitle = 'any4', numberOfPages = 27}";
    String actualResult = victim.toString();

    checkThatNamesMatch (expectedResult, actualResult, testDescription);
  }

  public void test5() {
    String testDescription = "Test5: Check that equals() method works correctly -";

    Book victim = new Book("Test5", "any5", 55);

    victim.equals(victim);

    boolean expectedResult = true;
    boolean actualResult = victim.equals(victim);

    checkThatObjectsMatch (expectedResult, actualResult, testDescription);
  }

  public void test6() {
    String testDescription = "Test6: Check that equals() method works correctly. It will return 'has failed' and return Expected 'true' but was 'false' -";

    Book victim = new Book("Test6", "any6", 66);
    Book victim2 = new Book("secondBook", "somePages", 88);

    victim.equals(victim2);

    boolean expectedResult = true;
    boolean actualResult = victim.equals(victim2);

    checkThatObjectsMatch (expectedResult, actualResult, testDescription);
  }

  public void checkThatEqual (int expected, int actual, String testDescription) {
    if (expected == actual) {
      System.out.println(testDescription + " has passed!");
    } else {
      System.out.println(testDescription + " has failed!");
      System.out.println("Expected '" + expected + "' but was '" + actual + "'");
    }
  }

  public void checkThatNamesMatch (String expected, String actual, String testDescription) {
    if (expected.equals(actual)) {
      System.out.println(testDescription + " has passed!");
    } else {
      System.out.println(testDescription + " has failed!");
      System.out.println("Expected '" + expected + "' but was '" + actual + "'");
    }
  }

  public void checkThatObjectsMatch (boolean expected, boolean actual, String testDescription) {
    if (expected == actual) {
      System.out.println(testDescription + " has passed!");
    } else {
      System.out.println(testDescription + " has failed!");
      System.out.println("Expected '" + expected + "' but was '" + actual + "'");
    }
  }
}
