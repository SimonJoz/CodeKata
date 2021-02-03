package com.company.katas;

public class VowelCount {


//    Return the number (count) of vowels in the given string.
//    We will consider a, e, i, o, and u as vowels for this Kata.
//    The input string will only consist of lower case letters and/or spaces.

    public static int getCount(String str) {
        return str.replaceAll("[^aeiou]", "").length();
    }


    public static int getCount2(String str) {
        int vowelsCount = 0;
        String[] letters = str.toLowerCase().split("");
        for (String letter : letters) {
            if (letter.matches("[aoeiu]")) vowelsCount++;
        }
        return vowelsCount;
    }

}
