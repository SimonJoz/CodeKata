package com.company.katas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToCamelCase {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the\\camel\\case"));
        System.out.println(toCamelCase1("The_camel_case"));
    }

    /// Case of first letter mustn't change.


    private static String toCamelCase(String s) {
        String[] str = s.split("[-_\\s+,.\\\\]");
        StringBuilder sb = new StringBuilder(str[0]);
        for (int i = 1; i < str.length; i++) {
            sb.append(str[i].substring(0, 1).toUpperCase()).append(str[i].substring(1));
        }
        return sb.toString();

    }

    private static String toCamelCase1(String s) {
        Matcher m = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group(1).toUpperCase());
        }
        return m.appendTail(sb).toString();
    }
}
