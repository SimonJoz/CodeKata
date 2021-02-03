package com.company.katas;

import java.util.Arrays;

public class MixedKata {

    public static void main(String[] args) {
        System.out.println(findNextSquare(121));
        System.out.println(toJadenCase("some text here"));
        System.out.println(disariumNumber(2341));
        System.out.println(findNeedle(new Object[]{"sda", "dsa", "gsadga", 1, 7, "needle"}));
        System.out.println(showSequence(10));
        System.out.println(squareDigits(919));
    }


//    Can you find the needle in the haystack?
//    Write a function findNeedle() that takes an array full of junk but containing one "needle"
//    After your function finds the needle it should return a message (as a string) that says:
//            "found the needle at position " plus the index it found the needle, so:
//    findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})
//    should return "found the needle at position 5"


    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }


//    Complete the findNextSquare method that finds the next integral perfect square
//    after the one passed as a parameter.
//    Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
//    If the parameter is itself not a perfect square, than -1 should be returned.
//    You may assume the parameter is positive.
//            Examples:
//    findNextSquare(121) --> returns 144
//    findNextSquare(625) --> returns 676
//    findNextSquare(114) --> returns -1 since 114 is not a perfect

    public static long findNextSquare(long sq) {
        double num = Math.sqrt(sq);
        if (Math.floor(num) != num) return -1;
        return (long) Math.pow(num + 1, 2);
    }

//    Your task is to convert strings to how they would be written by Jaden Smith.
//    The strings are actual quotes from Jaden Smith,
//    but they are not capitalized in the same way he originally typed them.

//    Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
//    Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"

    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) return null;
        StringBuilder sb = new StringBuilder();
        for (String s : phrase.split(" ")) {
            sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }


//    We want to generate a function that computes the series starting from 0 and ending until the given number.
//    Example:

//    Input: > 6
//    Output:  0+1+2+3+4+5+6 = 21

//    Input: > -15
//    Output: -15<0

    //    Input: > 0
//    Output:  0=0

    public static String showSequence(int value) {
        StringBuilder sb = new StringBuilder();
        if (value == 0) return "0=0";
        if (value < 0) return value + "<0";

        int result = 0;
        for (int i = 0; i <= value; i++) {
            sb.append(i).append("+");
            result += i;
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        return sb.append(" = ").append(result).toString();
    }


//    Disarium number is the number that The sum of its digits powered with
//    their respective positions is equal to the number itself.

//    Given a number, Find if it is Disarium or not .

//    Number passed is always Positive .
//    Return the result as String.

//    Input >> Output  disariumNumber(89) ==> return "Disarium !!"

//    Explanation:
//    Since , 8^1 + 9^2 = 89 , thus output is "Disarium !!"

//    Explanation:   Since , 5^1 + 6^2 + 4^3 = 105 != 564 , thus output is "Not !!"
//    disariumNumber(564) ==> return "Not !!"

    public static String disariumNumber(int n) {
        int digit, number = n, result = 0;
        int length = Integer.toString(n).length();
        for (int i = length - 1; i >= 0; i--) {
            digit = n % 10;
            n = n / 10;
            result += (int) Math.pow(digit, i + 1);
        }
        return (result == number) ? "Disarium !!" : "Not !!";
    }


//    Welcome. In this kata, you are asked to square every digit of a number.
//    For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
//    Note: The function accepts an integer and returns an integer

    public static int squareDigits(int n) {
        StringBuilder result = new StringBuilder();
        int length = Integer.toString(n).length();

        int[] numbers = new int[length];
        while (n > 0) {
            numbers[length - 1] = n % 10;
            n /= 10;
            result.append((int) Math.pow(numbers[length - 1], 2));
            length--;
        }
        return Integer.parseInt(result.toString());
    }
}