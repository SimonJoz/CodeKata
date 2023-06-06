package com.company.katas;

public class FindMissingLetter {

//    Write a method that takes an array of consecutive (increasing)
//    letters as input and that returns the missing letter in the array.
//    You will always get an valid array. And it will be always exactly one letter be missing.
//    The length of the array will always be at least 2.
//    The array will always contain letters in only one case.
//    Example:  ['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'

    public static char findMissingLetter(char[] arr) {
        int idx = 0;
        char missing = '\u0000';

        for (char i = arr[0]; i < arr[arr.length - 1]; i++) {
            if (arr[idx] != i) {
                missing = i;
                break;
            }
            idx++;
        }
        return missing;
    }
}
