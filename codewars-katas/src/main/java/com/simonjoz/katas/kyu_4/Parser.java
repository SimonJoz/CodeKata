package com.simonjoz.katas.kyu_4;

import java.util.Map;

public class Parser {

    private final static Map<String, Integer> map = Map.ofEntries(
            Map.entry("one", 1),
            Map.entry("two", 2),
            Map.entry("three", 3),
            Map.entry("four", 4),
            Map.entry("five", 5),
            Map.entry("six", 6),
            Map.entry("seven", 7),
            Map.entry("eight", 8),
            Map.entry("nine", 9),
            Map.entry("ten", 10),
            Map.entry("eleven", 11),
            Map.entry("twelve", 12),
            Map.entry("thirteen", 13),
            Map.entry("fourteen", 14),
            Map.entry("fifteen", 15),
            Map.entry("sixteen", 16),
            Map.entry("seventeen", 17),
            Map.entry("eighteen", 18),
            Map.entry("nineteen", 19),
            Map.entry("twenty", 20),
            Map.entry("thirty", 30),
            Map.entry("forty", 40),
            Map.entry("fifty", 50),
            Map.entry("sixty", 60),
            Map.entry("seventy", 70),
            Map.entry("eighty", 80),
            Map.entry("ninety", 90),
            Map.entry("hundred", 100),
            Map.entry("thousand", 1000),
            Map.entry("million", 1000_000)
    );

    //666 666
    //626798
    public static void main(String[] args) {
        System.out.println(Parser.parseInt("six hundred sixty-six thousand sixty-six hundred and six"));
    }

    public static int parseInt(String numStr) {
        int sum = 0;
        int temp = 0;

        for (String num : numStr.split(" ")) {

            if ("and".equals(num)) {
                continue;
            }

            int current = 0;

            if (num.contains("-")) {
                for (String n : num.split("-")) {
                    Integer integer = map.get(n);
                    if (integer != null) {
                        current += integer;
                    }

                }
            } else {
                Integer integer = map.get(num);
                if (integer != null) {
                    current = integer;
                }
            }

            sum = current == 100 || current == 1000 ? (sum - temp) + (temp * current) : sum + current;
            temp = current;
        }

        return sum;
    }
}
