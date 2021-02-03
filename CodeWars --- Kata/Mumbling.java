package com.company.katas;

public class Mumbling {
//    accum("abcd") -> "A-Bb-Ccc-Dddd"
//    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//    accum("cwAt") -> "C-Ww-Aaa-Tttt"

    public static String accum(String s) {
        String[] str = s.toUpperCase().split("");
        StringBuilder sb = new StringBuilder(str[0]);

        for (int i = 1; i < str.length; i++) {
            sb.append("-").append(str[i]).append(str[i].repeat(i).toLowerCase());
        }
        return sb.toString();
    }
}

