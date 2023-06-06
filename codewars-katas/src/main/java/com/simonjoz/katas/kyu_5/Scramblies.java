package com.simonjoz.katas.kyu_5;

import java.util.HashMap;
import java.util.Map;

public class Scramblies {


    /*
        Complete the function scramble(str1, str2) that returns true if a portion of str1 characters
        can be rearranged to match str2, otherwise returns false.

        Notes:

        Only lower case letters will be used (a-z). No punctuation or digits will be included.
        Performance needs to be considered.

        Examples
        scramble('rkqodlw', 'world') ==> True
        scramble('cedewaraaossoqqyt', 'codewars') ==> True
        scramble('katas', 'steak') ==> False
     */

    public static void main(String[] args) {
        System.out.println(scramble("scriptsjava", "javascripts"));
    }

    public static boolean scramble(String str1, String str2) {
        Map<Integer, Integer> reqMap = new HashMap<>();
        Map<Integer, Integer> availableMap = new HashMap<>();

        str1.chars().forEach(ch -> availableMap.merge(ch, 1, Integer::sum));
        str2.chars().forEach(ch -> reqMap.merge(ch, 1, Integer::sum));

        for (Map.Entry<Integer, Integer> entry : reqMap.entrySet()) {

            Integer available = availableMap.get(entry.getKey());
            Integer required = entry.getValue();

            if (available == null || available < required) {
                return false;
            }
        }
        return true;
    }
}
