package lesson07.palindrome;

public class PalindromeDemo {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        String palindromeOne = "racecar";
        String palindromeTwo = "level";
        String palindromeThree = "sum summus mus";
        String palindromeFour = "А роза упала на лапу Азора";
        String palindromeFive = "Le,VEl";
        String palindromeSix = "Le,VEl123";

        palindrome.isPalindrome(palindromeOne);
        palindrome.isPalindrome(palindromeTwo);
        palindrome.isPalindrome(palindromeThree);
        palindrome.isPalindrome(palindromeFour);
        palindrome.isPalindrome(palindromeFive);
        palindrome.isPalindrome(palindromeSix);
    }
}
