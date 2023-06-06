package com.company.katas;

public class Pangram {

    public static void main(String[] args) {
        System.out.println(pangram("The quick brown fox jumps over the lazy dog."));
    }

    private static boolean pangram(String text) {
        text = text.replaceAll(" ", "").toLowerCase();
        for (char i = 'a'; i < 'z'; i++) {
            if (!text.contains(String.valueOf(i))) return false;
        }
        return true;
    }
}
