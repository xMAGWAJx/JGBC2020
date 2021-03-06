package lesson09.uniquewordcounter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UniqueWordCounterTest {

    @Test
    void addWord() {
        UniqueWordCounter testCounter = new UniqueWordCounter();
        testCounter.addWord("test1");

        assertNotNull(testCounter);
    }

    @Test
    void getMostFrequentWord() {
        UniqueWordCounter testCounter = new UniqueWordCounter();
        testCounter.addWord("test1");
        testCounter.addWord("test2");
        testCounter.addWord("test1");
        testCounter.addWord("test1");

        assertEquals("test1", testCounter.getMostFrequentWord());
    }
}