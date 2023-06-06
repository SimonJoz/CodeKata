package com.simonjoz.katas.kyu_7;

public class Accumulator {

    /*
        This time no story, no theory. The examples below show you how to write function accum:

        Examples:
        accum("abcd") -> "A-Bb-Ccc-Dddd"
        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        accum("cwAt") -> "C-Ww-Aaa-Tttt"
        The parameter of accum is a string which includes only letters from a..z and A..Z.
    */
    public static void main(String[] args) {

    }

    public static String accum(String s) {

        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder(arr[0].toUpperCase());

        for (int i = 1; i < arr.length; i++) {

            sb.append("-")
                    .append(arr[i].toUpperCase())
                    .append(arr[i].toLowerCase().repeat(i));
        }
        return sb.toString();
    }


}
