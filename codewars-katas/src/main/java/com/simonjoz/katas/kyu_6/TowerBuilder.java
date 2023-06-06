package com.simonjoz.katas.kyu_6;

public class TowerBuilder {

    /*
        Build Tower
        Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors.
        A tower block is represented with "*" character.

        For example, a tower with 3 floors looks like this:

        [
          "  *  ",
          " *** ",
          "*****"
        ]
        And a tower with 6 floors looks like this:

        [
          "     *     ",
          "    ***    ",
          "   *****   ",
          "  *******  ",
          " ********* ",
          "***********"
        ]
    */

    public static void main(String[] args) {
        for (String s : build(6)) {
            System.out.println(s);
        }
    }

    public static String[] build(int nFloors) {

        String[] arr = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            String blanks = " ".repeat(nFloors - i - 1);
            String stars = "*".repeat(i * 2 + 1);
            arr[i] = "%s%s%s".formatted(blanks, stars, blanks);
        }
        return arr;
    }
}
