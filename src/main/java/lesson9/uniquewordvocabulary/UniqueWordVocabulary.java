package lesson9.uniquewordvocabulary;

public class UniqueWordVocabulary {

    public void addWord(String word) {
        if ((word.isEmpty()) || (word.equals(word))) {
            System.out.println("Word is empty or this word is a duplicate.");
        } else {
            addWord(word);
        }
    }

//    public int getWordsCount() {
//        //TODO
//    }
//
//    public void printVocabulary() {
//        //TODO
//    }
}
