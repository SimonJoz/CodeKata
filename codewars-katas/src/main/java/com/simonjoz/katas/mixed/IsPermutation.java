package com.company.katas;

import java.util.Arrays;

public class IsPermutation {
    public static void main(String[] args) {

        String text = "xyzx";
        String text2 = "xzyx";
        System.out.println(permutation(text, text2));
    }

    private static boolean permutation(String text, String text2) {
        boolean permutation = false;
        char[] arr1 = text.toCharArray();
        char[] arr2 = text2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            permutation = true;
        }
        return permutation;
    }
}
