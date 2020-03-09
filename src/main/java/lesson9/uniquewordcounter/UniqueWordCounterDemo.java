package lesson9.uniquewordcounter;

public class UniqueWordCounterDemo {

    public static void main(String[] args) {
        UniqueWordCounter wordCounter = new UniqueWordCounter();
        wordCounter.addWord("apple");
        wordCounter.addWord("mango");
        wordCounter.addWord("apple");

        wordCounter.getMostFrequentWord(); //Should return "apple"
        wordCounter.printWordsFrequency(); //Should print apple = 2, mango = 1
    }
}
