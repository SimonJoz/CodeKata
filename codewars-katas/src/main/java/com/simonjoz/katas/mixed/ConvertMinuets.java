package com.company.katas;

public class ConvertMinuets {

    public static void main(String[] args) {
        minutesInYears(1000);
    }

    private final static int YEAR = 365 * 24 * 60;
    private final static int DAY = 24 * 60;
    private final static int HOUR = 60;

    private static void minutesInYears(long minutes) {
        if (minutes < 0)
            System.out.println("Invalid value entered..");

        if (minutes >= YEAR)
            System.out.println("Years: " + minutes / YEAR);
        minutes = minutes % YEAR;

        if (minutes >= DAY)
            System.out.println("Days: " + minutes / DAY);
        minutes = minutes % DAY;

        if (minutes >= HOUR)
            System.out.println("Hour: " + minutes / HOUR);
        minutes = minutes % HOUR;

        System.out.println("Minutes: " + minutes);
    }

}
