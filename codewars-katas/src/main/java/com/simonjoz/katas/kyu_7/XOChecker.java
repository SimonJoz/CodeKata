package com.simonjoz.katas.kyu_7;

public class XOChecker {


    /*
       7Kyu
       Check to see if a string has the same amount of 'x's and 'o's.
       The method must return a boolean and be case insensitive.
       The string can contain any char.

       Examples input/output:

       XO("ooxx") => true
       XO("xooxx") => false
       XO("ooxXm") => true
       XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
       XO("zzoo") => false
    */

    public static void main(String[] args) {
        System.out.println(getXO("xooxx"));
    }

    public static boolean getXO(String str) {
        return str == null || str.replaceAll("[xX]", "").length() == str.replaceAll("[oO]", "").length();
    }
}
