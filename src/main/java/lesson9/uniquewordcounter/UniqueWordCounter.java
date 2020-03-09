package lesson9.uniquewordcounter;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    private Map<String, Integer> uniqueWordCounter = new HashMap<>();

    public void addWord(String word) {
        if (uniqueWordCounter.containsKey(word)) {
            int howManyTimesWordWasAdded = uniqueWordCounter.get(word);
            uniqueWordCounter.put(word, ++howManyTimesWordWasAdded);
        } else {
            uniqueWordCounter.put(word, 1);
        }

    }

    public String getMostFrequentWord() {
        String returnMostFrequentWord = null;
        int mostFrequentWord = 1;
        for (Map.Entry<String, Integer> entry: uniqueWordCounter.entrySet()) {
            if (entry.getValue() >= mostFrequentWord) {
                mostFrequentWord = entry.getValue();
                returnMostFrequentWord = entry.getKey();
            }
        }
        System.out.println(returnMostFrequentWord);
        return returnMostFrequentWord;
    }

    public void printWordsFrequency() {
        for (Map.Entry<String, Integer> entry: uniqueWordCounter.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
