package com.company.katas;

public class PhoneNumber {

//    Write a function that accepts an array of 10 integers (between 0 and 9),
//    that returns a string of those numbers in the form of a phone number.
//    Example: Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
//    The returned format must be correct in order to complete this challenge.
//            Don't forget the space after the closing parentheses!

    public static String createPhoneNumber(int[] n) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", n[0], n[1], n[2], n[3], n[4], n[5], n[6], n[7], n[8], n[9]);
    }

    public static String createPhoneNumber2(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) sb.append(number);
        return sb.insert(0, "(").insert(4, ") ").insert(9, "-").toString();
    }


    public static String createPhoneNumber3(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) sb.append(number);
        return "(" + sb.substring(0, 3) + ") " + sb.substring(3, 6) + "-" + sb.substring(6);
    }
}
