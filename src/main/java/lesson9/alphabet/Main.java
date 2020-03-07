package lesson9.alphabet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> alphabet = new ArrayList<>();
        System.out.println("alphabet = " + alphabet);
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        alphabet.add("D");
        System.out.println("alphabet = " + alphabet);

        alphabet.add("F");
        alphabet.add("G");
        System.out.println("alphabet = " + alphabet);
        System.out.println("alphabet.size() = " + alphabet.size());
        System.out.println("alphabet.get(2) = " + alphabet.get(2));

        alphabet.add(4, "E");
        System.out.println("alphabet = " + alphabet);

        System.out.println();
        System.out.println("-- Contains & Remove --");
        System.out.println("alphabet.contains(\"A\") = " + alphabet.contains("A"));
        System.out.println("alphabet.contains(\"B\") = " + alphabet.contains("B"));
        System.out.println("alphabet.contains(\"X\") = " + alphabet.contains("X"));
        alphabet.remove(0);
        alphabet.remove("B");
        System.out.println("alphabet.contains(\"A\") = " + alphabet.contains("A"));
        System.out.println("alphabet.contains(\"B\") = " + alphabet.contains("B"));
        System.out.println("alphabet = " + alphabet);
        System.out.println("alphabet.size() = " + alphabet.size());

        System.out.println();
        System.out.println("-- Clear --");
        alphabet.clear();
        System.out.println("alphabet = " + alphabet);
        System.out.println("alphabet.size() = " + alphabet.size());
    }
}
