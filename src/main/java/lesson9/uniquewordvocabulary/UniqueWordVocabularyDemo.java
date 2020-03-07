package lesson9.uniquewordvocabulary;

public class UniqueWordVocabularyDemo {

    public static void main(String[] args) {

        UniqueWordVocabulary zoo = new UniqueWordVocabulary();

        zoo.addWord("Tiger");

        zoo.printVocabulary();

        System.out.println(zoo.getWordsCount());

        zoo.addWord("Panther");

        zoo.printVocabulary();

        System.out.println(zoo.getWordsCount());

        zoo.addWord("Lion");

        zoo.printVocabulary();

        zoo.addWord("Lion");

        zoo.printVocabulary();

        System.out.println(zoo.getWordsCount());

    }
}
