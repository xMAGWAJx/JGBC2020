package lesson05.tv;

public class TvTest {

    public static void main(String[] args) {

        TvTest testRunner = new TvTest();

        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();
        testRunner.test6();
        testRunner.test7();
        testRunner.test8();
        testRunner.test9();
        testRunner.test10();
    }

    public void test1() {
        String testDescription = "Test1: Check next chanel changes after nextChannel() -";

        Tv victim = new Tv(2, 4, "Test1", true);

        victim.nextChannel();

        int expectedResult = 3;
        int actualResult = victim.getCurrentChannel();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test2() {
        String testDescription = "Test2: Check previous chanel changes after previousChannel() -";

        Tv victim = new Tv(2, 4, "Test2", true);

        victim.previousChannel();

        int expectedResult = 1;
        int actualResult = victim.getCurrentChannel();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test3() {
        String testDescription = "Test3: Check volume is added after addVolume() -";

        Tv victim = new Tv(2, 4, "Test3", true);

        victim.addVolume();

        int expectedResult = 5;
        int actualResult = victim.getCurrentVolume();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test4() {
        String testDescription = "Test4: Check volume decreases after decreaseVolume() -";

        Tv victim = new Tv(2, 4, "Test4", true);

        victim.decreaseVolume();

        int expectedResult = 3;
        int actualResult = victim.getCurrentVolume();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test5() {
        String testDescription = "Test5: Check next chanel does not changes after nextChannel() if isTVon() = false -";

        Tv victim = new Tv(2, 4, "Test5", false);

        victim.nextChannel();

        int expectedResult = 2;
        int actualResult = victim.getCurrentChannel();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test6() {
        String testDescription = "Test6: Check previous chanel does not changes after previousChannel() if isTVon() = false -";

        Tv victim = new Tv(2, 4, "Test6", false);

        victim.previousChannel();

        int expectedResult = 2;
        int actualResult = victim.getCurrentChannel();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test7() {
        String testDescription = "Test7: Check volume is not added after addVolume() if isTVon() = false -";

        Tv victim = new Tv(2, 4, "Test7", false);

        victim.addVolume();

        int expectedResult = 4;
        int actualResult = victim.getCurrentVolume();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test8() {
        String testDescription = "Test8: Check volume is not decreases after decreaseVolume() if isTVon() = false  -";

        Tv victim = new Tv(2, 4, "Test8", false);

        victim.decreaseVolume();

        int expectedResult = 4;
        int actualResult = victim.getCurrentVolume();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test9() {
        String testDescription = "Test9: Check that equals() method works correctly -";

        Tv victim = new Tv(2, 4, "Test9", false);
        Tv victim2 = new Tv(2, 4, "Test9", false);

        victim.equals(victim2);

        boolean expectedResult = true;
        boolean actualResult = victim.equals(victim2);

        checkThatObjectsMatch(expectedResult, actualResult, testDescription);
    }

    public void test10() {
        String testDescription = "Test10: Check that toString() method works correctly -";

        Tv victim = new Tv(1, 10, "Test10", true);

        victim.toString();

        String expectedResult = "Tv{currentChannel=1, currentVolume=10, manufacturer='Test10', isTVon=true}";
        String actualResult = victim.toString();

        checkThatNamesMatch(expectedResult, actualResult, testDescription);
    }

    public void checkThatEqual(int expected, int actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }

    public void checkThatObjectsMatch(boolean expected, boolean actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }

    public void checkThatNamesMatch(String expected, String actual, String testDescription) {
        if (expected.equals(actual)) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
