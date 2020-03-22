package lesson04.assertions;

public class CalculatorTest {

    public static void main(String[] args) {

        CalculatorTest testRunner = new CalculatorTest();
        testRunner.test1();
    }

    public void test1() {
        String testDescription = "Should correctly sum two integers";

        Calculator victim = new Calculator();

        int expectedResult = 4;
        int actualResult = victim.sum(2, 2);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }


    public void checkThatEqual(int expected, int actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
