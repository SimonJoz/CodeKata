package com.simonjoz.katas.kyu_7;

import java.util.List;

public class BinaryArrayToNumber {

    /*
        Given an array of ones and zeroes, convert the equivalent binary value to an integer.

        Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

        Examples:

        Testing: [0, 0, 0, 1] ==> 1
        Testing: [0, 0, 1, 0] ==> 2
        Testing: [0, 1, 0, 1] ==> 5
        Testing: [1, 0, 0, 1] ==> 9
        Testing: [0, 0, 1, 0] ==> 2
        Testing: [0, 1, 1, 0] ==> 6
        Testing: [1, 1, 1, 1] ==> 15
        Testing: [1, 0, 1, 1] ==> 11

     */


    public static void main(String[] args) {
        System.out.println(convertBinaryArrayToInt(List.of(1, 0, 1, 1)));
    }

    public static int convertBinaryArrayToInt(List<Integer> binary) {

        int pow = 2;
        int lastIdx = binary.size() - 1;
        int number = binary.get(lastIdx);

        for (int i = lastIdx - 1; i >= 0; i--) {
            number += binary.get(i) * pow;
            pow *= 2;
        }
        return number;

//        String binaryStr = binary.stream()
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//
//        return Integer.parseInt(binaryStr, 2);
    }
}
