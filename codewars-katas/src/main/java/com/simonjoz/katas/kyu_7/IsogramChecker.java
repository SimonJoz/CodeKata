package com.simonjoz.katas.kyu_7;

public class IsogramChecker {
    /*
    7Kyu
    An isogram is a word that has no repeating letters, consecutive or non-consecutive.
    Implement a function that determines whether a string that contains only letters is an isogram.
    Assume the empty string is an isogram. Ignore letter case.

    Example: (Input --> Output)

    "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

    isIsogram "Dermatoglyphics" = true
    isIsogram "moose" = false
    isIsogram "aba" = false

    */
    public static void main(String[] args) {
        System.out.println(isIsogram(""));
    }

    public static boolean isIsogram(String str) {

        return str.length() == str.toLowerCase().chars().distinct().count();

//        return str == null || "".equals(str) || Arrays.stream(str.toLowerCase().split(""))
//                .distinct()
//                .toList().size() == str.length();

//     String[] arr = str.toLowerCase().split("");
//     List<String> list = Arrays.asList(arr);
//     Set<String> set = new HashSet<>(list);
//     return set.size() == arr.length;

    }
}
