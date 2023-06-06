package com.company.katas;

import java.util.Scanner;

public class SpinWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(spinWords(in));
    }
    /// revers word bigger than five letters.
    ///// "lets spin sdrow reggib then five srettel."

    private static String spinWords(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] str = sentence.split(" ");
        for (String s : str) {
            if (s.length() >= 5) s = new StringBuilder(s).reverse().toString();
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }
}
