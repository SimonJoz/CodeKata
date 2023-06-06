package com.simonjoz.katas.kyu_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCaseBreaker {

    /*
    Complete the solution so that the function will break up camel casing, using a space between words.

    Example
    "camelCasing"  =>  "camel Casing"
    "identifier"   =>  "identifier"
    ""             =>  ""

    */

    public static void main(String[] args) {
        System.out.println(breakCamelCase("camelCasing"));
    }

    public static String breakCamelCase(String input) {

        if (input == null) {
            return "";
        }
        return input.replaceAll("([A-Z])", " $1");
//
//        Matcher matcher = Pattern.compile("[A-Z]").matcher(input);
//        return matcher.find() ? matcher.replaceAll(p -> " " + p.group()) : input;
    }
}
