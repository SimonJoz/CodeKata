package com.simonjoz.katas.kyu_5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {

    /*
    My friend John and I are members of the "Fat to Fit Club (FFC)".
    John is worried because each month a list with the weights of members is published
    and each month he is the last on the list which means he is the heaviest.

    I am the one who establishes the list, so I told him:
    "Don't worry anymore, I will modify the order of the list".
    It was decided to attribute a "weight" to numbers.
    The weight of a number will be from now on the sum of its digits.

    For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.

    Given a string with the weights of FFC members in normal order can you give this string ordered
    by "weights" of these numbers?

    Example:
    "56 65 74 100 99 68 86 180 90" ordered by numbers weights becomes:

    "100 180 90 56 65 74 68 86 99"

    When two numbers have the same "weight", let us class them as if they were strings
    (alphabetical ordering) and not numbers:

    180 is before 90 since, having the same "weight" (9), it comes before as a string.

    All numbers in the list are positive numbers and the list can be empty.

    Notes
    It may happen that the input string have leading, trailing whitespaces and more than a
    unique whitespace between two consecutive numbers

    For C: The result is freed.

     */

    public static void main(String[] args) {
        System.out.println(orderWeight("56 65 74 100 99 68 86 180 90"));
    }

    public static String orderWeight(String str) {

        if (str == null || "".equals(str.trim())) {
            return "";
        }

        return Arrays.stream(str.split("\\s"))
                .sorted((strNum1, strNum2) -> {

                    int sum1 = Arrays.stream(strNum1.split("")).mapToInt(Integer::parseInt).sum();
                    int sum2 = Arrays.stream(strNum2.split("")).mapToInt(Integer::parseInt).sum();

                    if (sum1 == sum2) {
                        return strNum1.compareTo(strNum2);
                    }
                    return Integer.compare(sum1, sum2);
                }).collect(Collectors.joining(" "));
    }
}
