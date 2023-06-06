package com.simonjoz.katas.kyu_4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StripComments {


    public static void main(String[] args) {
        String s = stripComments("\napples, pears\n[\n ] \n # and bananas\n\n\n\ngrapes\nbananas !apples", new String[]{"#", "!"});
        System.out.println(s);
    }

    public static String stripComments(String text, String[] commentSymbols) {

        String regex = Arrays.stream(commentSymbols)
                .map("\\%s+.*"::formatted)
                .collect(Collectors.joining("|"));

        return text.replaceAll(regex, "")
                .replaceAll(" +\n", "\n")
                .stripTrailing();
    }

}
