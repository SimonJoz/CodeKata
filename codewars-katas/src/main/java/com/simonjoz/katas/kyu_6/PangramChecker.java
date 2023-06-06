package com.simonjoz.katas.kyu_6;

public class PangramChecker {

    /*
        A pangram is a sentence that contains every single letter of the alphabet at least once.
        For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
        because it uses the letters A-Z at least once (case is irrelevant).

        Given a string, detect whether it is a pangram. Return True if it is,
        False if not. Ignore numbers and punctuation.
     */

    public static void main(String[] args) {

    }

    public static boolean isPangram(String sentence) {

//        sentence = sentence.toLowerCase();
//
//        for (char letter = 'a'; letter <= 'z'; letter++) {
//
//            if (!sentence.contains(String.valueOf(letter))) {
//                return false;
//            }
//        }
//        return true;

        return sentence.toLowerCase().chars().filter(Character::isAlphabetic).distinct().count() == 26;
    }
}
