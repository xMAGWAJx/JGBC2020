package lesson09.words;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        System.out.println("words = " + words);
        words.add("Apple");
        words.add("Mango");
        words.add("Pineapple");
        words.add("Watermelon");
        System.out.println("words = " + words);

        System.out.println("words.size() = " + words.size());
        words.add("Apple");
        words.add("Pear");
        words.add("Pineapple");
        words.add("Orange");
        words.add("Watermelon");
        System.out.println("words = " + words);
        System.out.println("words.size() = " + words.size());

        System.out.println();
        System.out.println("-- Contains & Remove --");
        System.out.println("words.contains(\"apple\") = " + words.contains("apple"));
        System.out.println("words.contains(\"Apple\") = " + words.contains("Apple"));
        words.remove("Mango");
        System.out.println("words = " + words);
        System.out.println("words.size() = " + words.size());
        words.clear();
        System.out.println("words = " + words);
        System.out.println("words.size() = " + words.size());
    }
}
