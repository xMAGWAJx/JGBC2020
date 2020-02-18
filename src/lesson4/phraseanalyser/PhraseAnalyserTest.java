package lesson4.phraseanalyser;

public class PhraseAnalyserTest {

    public static void main(String[] args) {

        PhraseAnalyserTest testRunner = new PhraseAnalyserTest();

        // Correct values passed in Tests: 1,2,3,4

        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();

        // Incorrect values passed in Tests: 5,6,7,8

        testRunner.test5();
        testRunner.test6();
    }

    public void test1() {
        String testDescription = "Test1: Return correct answer - It stands no chance";

        PhraseAnalyser victim = new PhraseAnalyser();

        String text = "Make pancakes great again";

        String expectedResult = "It stands no chance";
        String actualResult = victim.analyse(text);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test2() {
        String testDescription = "Test2: Return correct answer - It could be worse for first part of fraze = Make";

        PhraseAnalyser victim = new PhraseAnalyser();

        String text = "Make something nice";

        String expectedResult = "It could be worse";
        String actualResult = victim.analyse(text);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test3() {
        String testDescription = "Test3: Return correct answer - It could be worse for last part of fraze = great again";

        PhraseAnalyser victim = new PhraseAnalyser();

        String text = "Let's make something great again";

        String expectedResult = "It could be worse";
        String actualResult = victim.analyse(text);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test4() {
        String testDescription = "Test4: Return correct answer - It is fine, really - because sentence doe's not starts from Make and doesn't ends with great again";

        PhraseAnalyser victim = new PhraseAnalyser();

        String text = "Some text to check that everything works fine!";

        String expectedResult = "It is fine, really";
        String actualResult = victim.analyse(text);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test5() {
        String testDescription = "Test5: Return failed for - It stands no chance because fraze doesn't starts with Make and doesn't end with great again";

        PhraseAnalyser victim = new PhraseAnalyser();

        String text = "Some text to check that everything works fine!";

        String expectedResult = "It stands no chance";
        String actualResult = victim.analyse(text);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void test6() {
        String testDescription = "Test6: Return failed for - It could be worse - because sentence doe's not starts from Make";

        PhraseAnalyser victim = new PhraseAnalyser();

        String text = "Some text to check that everything works fine!";

        String expectedResult = "It stands no chance";
        String actualResult = victim.analyse(text);

        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void checkThatEqual (String expected, String actual, String testDescription) {
        if (expected.equals(actual)) {
            System.out.println(testDescription + " - has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
