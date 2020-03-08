package lesson9.uniquewordcounter;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    private Map<String, Integer> uniqueWordCounter = new HashMap<>();

    public void addWord(String word) {
        if (uniqueWordCounter.containsKey(word)) {
            int howManyTimesWordWasAdded = uniqueWordCounter.get(word);
            uniqueWordCounter.put(word, howManyTimesWordWasAdded++);
            System.out.println(word + " " + howManyTimesWordWasAdded);
        } else {
            uniqueWordCounter.put(word, 1);
            System.out.println(word);
        }

    }

//    public int getMostFrequentWord() {
//
//    }
//
//    public void printWordsFrequency() {
//
//    }
}
