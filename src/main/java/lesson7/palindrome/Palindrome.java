package lesson7.palindrome;

import java.util.Arrays;

public class Palindrome {

    public void isPalindrome(String text) {
        boolean stringIsPalindrome = true;

        text = text.toLowerCase().replaceAll("[^a-zA-Z0-9а-яА-Я]", "");
        char[] charArray = text.toCharArray();
        int charArraySize = charArray.length;

        char[] charArrayToCompare = Arrays.copyOf(charArray,charArray.length);

        for (int i = 0; i < charArraySize / 2; i++) {
            char tempCharacter = charArray[i];
            charArray[i] = charArray[charArraySize - i - 1];
            charArray[charArraySize - i - 1] = tempCharacter;
        }

        if (Arrays.equals(charArray, charArrayToCompare)) {
            System.out.println("Is '" + text + "' a palindrome? Result: " + stringIsPalindrome);
        } else {
            System.out.println("Is '" + text + "' a palindrome? Result: " + !stringIsPalindrome);
        }
    }
}
