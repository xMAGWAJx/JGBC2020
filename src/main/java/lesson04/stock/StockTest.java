package lesson04.stock;

public class StockTest {

    public static void main(String[] args) {

        StockTest testRunner = new StockTest();

        testRunner.test1();
        testRunner.test2();
        testRunner.test3();

    }

    public void test1() {
        String testDescription = "Test1: Check that price is updated correctly";

        Stock victim = new Stock("Test1", 10);

        victim.updatePrice(15);

        int expectedResult = 15;
        int actualResult = victim.getCurrentPrice();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test2() {
        String testDescription = "Test2: Check that price is updated correctly if there are multiple updates";

        Stock victim = new Stock("Test2", 10);

        victim.updatePrice(15);
        victim.updatePrice(29);
        victim.updatePrice(31);

        int expectedResult = 31;
        int actualResult = victim.getCurrentPrice();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test3() {
        String testDescription = "Test3: Check that companyName is set correctly";

        Stock victim = new Stock("Test3", 10);

        String expectedResult = "Test3";
        String actualResult = victim.getCompanyName();

        checkCompanyName(expectedResult, actualResult, testDescription);
    }

    public void checkThatEqual(int expected, int actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("Expeceted '" + expected + "' but was '" + actual + "'");
        }
    }

    public void checkCompanyName(String expected, String actual, String testDescription) {
        if (expected.equals(actual)) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("Expeceted '" + expected + "' but was '" + actual + "'");
        }
    }
}
