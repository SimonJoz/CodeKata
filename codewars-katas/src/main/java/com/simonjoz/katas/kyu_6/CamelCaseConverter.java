package com.simonjoz.katas.kyu_6;

public class CamelCaseConverter {

    /**
     *
     * Complete the method/function so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
     *
     * Examples
     *  "the-stealth-warrior" gets converted to "theStealthWarrior"
     *  "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     *
     */

    public static void main(String[] args) {
        System.out.println(toCamelCase("The_stealth_warrior"));
    }

    public static String toCamelCase(String text) {
        final String[] arr;
        final StringBuilder sb;

        if (text == null || (arr = text.split("_|-")).length == 0) {
            return "";
        }

        sb = new StringBuilder(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            String word = arr[i];
            sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
        }
        return sb.toString();
    }
}
