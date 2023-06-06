package com.company.katas;

import java.util.GregorianCalendar;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
    }

    private static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;
        return year % 4 == 0 && year % 100 != 0;
    }

    private static boolean isLeapYear2(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }
}
