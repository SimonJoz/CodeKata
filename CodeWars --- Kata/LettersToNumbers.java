package com.company.katas;

import java.util.HashMap;
import java.util.Map;

public class LettersToNumbers {

    public static void main(String[] args) {
        // char a ---- 1.
        // char z ---- 26.
        System.out.println(alphabetPosition1("The sunset sets at twelve o' clock."));
        System.out.println(alphabetPosition2("The sunset sets at twelve o' clock."));
        // output -- "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"
    }

    private static String alphabetPosition1(String text) {
        /// text to char[]
        char[] letters = text.toLowerCase().replaceAll(" ", "").toCharArray();
        StringBuilder sb = new StringBuilder();
        Map<Integer, Character> map = new HashMap<>();

        /// fill map with keys 1-26 and values a - z
        int count = 1;
        for (char i = 'a'; i <= 'z'; i++) {
            map.put(count, i);
            count++;
        }
        /// checking given text with map values and replace text with numbers(keys);
        for (int i = 0; i < letters.length - 1; i++) {
            for (Integer key : map.keySet()) {
                if (letters[i] == map.get(key))
                    sb.append(key).append(" ");
            }
        }

        return sb.toString().trim();
    }

    private static String alphabetPosition2(String text) {
        /// text to char[]
        char[] letters = text.toLowerCase().replaceAll(" ", "").toCharArray();
        char[] alphabet = new char[26];

        /// fill array with values a - z
        int count = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet[count] = i;
            count++;
        }
        StringBuilder sb = new StringBuilder();
        /// checking given text with map values and replace text with numbers(keys);
        for (char l : letters) {
            for (int i = 0; i < alphabet.length; i++) {
                if (l == alphabet[i])
                    // 'a' starts at index 0.
                    sb.append(i + 1).append(" ");
            }
        }
        return sb.toString().trim();
    }
}
