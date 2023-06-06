package com.company.katas;

public class DependOnTypCharCounter {

    public static void main(String[] args) {

        System.out.println(countChar("  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33"));
        System.out.println(countChar2("  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33"));

    }

    // count letters
    private static String countChar(String text) {
        int space = text.replaceAll("[^\\s]", "").length();
        int letter = text.replaceAll("[^[A-Z][a-z]]", "").length();
        int number = text.replaceAll("[^\\d]", "").length();
        int other = text.replaceAll("\\w*\\s*", "").length();
        return " letters: " + letter + " spaces: " + space + " numbers: " + number + " others: " + other;
    }


    private static String countChar2(String text) {
        int letter = 0, space = 0, number = 0, other = 0;
        String[] chars = text.split("");
        for (String aChar : chars) {
            if (aChar.matches(" ")) space++;
            else if (aChar.matches("[A-Z]*[a-z]*")) letter++;
            else if (aChar.matches("[0-9]")) number++;
            else other++;
        }
        return " letters: " + letter + " spaces: " + space + " numbers: " + number + " others: " + other;
    }
}

