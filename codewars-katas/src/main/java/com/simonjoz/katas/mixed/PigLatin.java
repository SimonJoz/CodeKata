package com.company.katas;

public class PigLatin {

//    Move the first letter of each word to the end of it,
//    then add "ay" to the end of the word. Leave punctuation marks untouched.

//    pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
//    pigIt('Hello world !');     // elloHay orldway !

    public static String pigIt(String str) {
        StringBuilder sb = new StringBuilder();

        for (String s : str.split(" ")) {
            if (s.matches("([a-z,A-Z]+[,.\\\\;\\-:!?])")) {

                sb.append(s, 1, s.length() - 1).append(s, 0, 1).append("ay")
                        .append(s.substring(s.length() - 1)).append(" ");

            } else if (s.matches("[.!?]")) sb.append(s);
            else sb.append(s.substring(1)).append(s, 0, 1).append("ay ");
        }
        return sb.toString().trim();
    }
}

