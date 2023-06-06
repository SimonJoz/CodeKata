package com.company.katas;

import java.util.GregorianCalendar;

public class DaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2020));
    }

    private static int getDaysInMonth(int month, int year) {
        if (month > 12 || month < 1) return -1;
        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) return 31;
        if (month == 2 && !isLeapYear(year)) return 28;
        if (month == 2 && isLeapYear(year)) return 29;
        return 30;
    }

    private static boolean isLeapYear(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }
}
