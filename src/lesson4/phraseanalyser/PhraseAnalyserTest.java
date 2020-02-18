package lesson4.phraseanalyser;

public class PhraseAnalyserTest {

    public static void main(String[] args) {

        PhraseAnalyserTest testRunner = new PhraseAnalyserTest();
        testRunner.test1();
    }

    public void test1() {
        String testDescription = "Test number 1: Return correct answer - It stands no chance";

        PhraseAnalyser victim = new PhraseAnalyser();

        victim.analyse("Make pancakes great again");

        String expectedResult = "It stands no chance";
        String actualResult = victim.getAnalyse();

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void checkThatEqual (String expected, String actual, String testDescription) {
        if (expected.equals(actual)) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
