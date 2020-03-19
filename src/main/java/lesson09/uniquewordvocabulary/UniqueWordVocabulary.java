package lesson09.uniquewordvocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    private Set<String> uniqueWordVocabulary = new HashSet<>();

    public void addWord(String word) {
        if (word.isEmpty()) {
            System.out.println("Word is empty or this word is a duplicate.");
        } else {
            uniqueWordVocabulary.add(word);
        }
    }

    public int getWordsCount() {
        return uniqueWordVocabulary.size();
    }

    public void printVocabulary() {
        System.out.println(uniqueWordVocabulary);
    }
}
