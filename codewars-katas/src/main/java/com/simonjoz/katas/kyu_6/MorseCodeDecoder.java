package com.simonjoz.katas.kyu_6;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeDecoder {

    /*
    In this kata you have to write a simple Morse code decoder.
    While the Morse code is now mostly superseded by voice and digital data communication channels,
    it still has its use in some applications around the world.
    The Morse code encodes every character as a sequence of "dots" and "dashes".
    For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−.
    The Morse code is case-insensitive, traditionally capital letters are used.
    When the message is written in Morse code, a single space is used to separate the
    character codes and 3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.

    NOTE: Extra spaces before or after the code have no meaning and should be ignored.

    In addition to letters, digits and some punctuation, there are some special service codes,
    the most notorious of those is the international distress signal SOS
    (that was first issued by Titanic), that is coded as ···−−−···.
    These special codes are treated as single special characters, and usually are transmitted as separate words.

    Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.

    For example:

    MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
    //should return "HEY JUDE"

    Good luck!

    After you complete this kata, you may try yourself at Decode the Morse code, advanced.
    */

    public static void main(String[] args) {
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
    }

    public static String decode(String morseCode) {

        return Arrays.stream(morseCode.split("\\s{3,}"))
                .map(w -> w.split("\\s"))
                .map(letters -> Arrays.stream(letters).map(MorseCode::get).reduce("", (x, y) -> x + y))
                .collect(Collectors.joining(" "));


//        StringBuilder sb = new StringBuilder();
//        String[] words = morseCode.split("\\s{3,}");
//
//        for (String word : words) {
//
//            String[] letters = word.split("\\s");
//            for (String letter : letters) {
//                sb.append(MorseCode.get(letter));
//            }
//            sb.append(" ");
//        }
//
//        return sb.toString().trim();

    }

}

class MorseCode {

    private final static Map<String, String> alphabet = Map.ofEntries(
            Map.entry(".-", "A"),
            Map.entry("-...", "B"),
            Map.entry("-.-.", "C"),
            Map.entry("-..", "D"),
            Map.entry(".", "E"),
            Map.entry("..-.", "F"),
            Map.entry("--.", "G"),
            Map.entry("....", "H"),
            Map.entry("..", "I"),
            Map.entry(".---", "J"),
            Map.entry("-.-", "K"),
            Map.entry(".-..", "L"),
            Map.entry("--", "M"),
            Map.entry("-.", "N"),
            Map.entry("---", "O"),
            Map.entry(".--.", "P"),
            Map.entry("--.-", "Q"),
            Map.entry(".-.", "R"),
            Map.entry("...", "S"),
            Map.entry("-", "T"),
            Map.entry("..-", "U"),
            Map.entry("...-", "V"),
            Map.entry(".--", "W"),
            Map.entry("-..-", "X"),
            Map.entry("-.--", "Y"),
            Map.entry("--..", "Z"),
            Map.entry("-----", "0"),
            Map.entry(".----", "1"),
            Map.entry("..---", "2"),
            Map.entry("...--", "3"),
            Map.entry("....-", "4"),
            Map.entry(".....", "5"),
            Map.entry("-....", "6"),
            Map.entry("--...", "7"),
            Map.entry("---..", "8"),
            Map.entry("----.", "9")
    );

    public static String get(String code) {
        return alphabet.get(code);
    }

}
