package lesson09.uniquewordvocabulary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueWordVocabularyTest {

    @Test
    void getWordsCount() {
        UniqueWordVocabulary test = new UniqueWordVocabulary();

        test.addWord("testWord1");
        test.addWord("testWord2");
        test.addWord("testWord3");

        assertEquals(3, test.getWordsCount());
    }

    @Test
    void getWordsCount_addDuplicateWordItWouldBeIgnored() {
        UniqueWordVocabulary test = new UniqueWordVocabulary();

        test.addWord("testWord1");
        test.addWord("testWord2");
        test.addWord("testWord3");
        test.addWord("testWord3");

        assertEquals(3, test.getWordsCount());
    }
}